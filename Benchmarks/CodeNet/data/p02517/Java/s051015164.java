//RMQ solution
//q*r*c*r*c solution
#include<iostream>
#include<cstdio>
#include<algorithm>
#include<climits>
using namespace std;
#define REP(i,b,n) for(int i=b;i<n;i++)
#define rep(i,n)   REP(i,0,n)
#define ROW(i,j,lda) ((i)*(lda)+(j))
#define COL(i,j,lda) ((j)*(lda)+(i))

const int N = (1<<22);//number of element
const int M = 2*N;//required memory 
const int MAX_VALUE=INT_MAX;//maximum possible value;
int segt[M];//init with MAX_VALUE
int inp[N];

void update(int value,int pos,int n){
  int index=n-1+pos;
  segt[index]=value;//[pos,pos]
  while(index>0){
    index=(index-1)/2;
    segt[index]=min(segt[index*2+1],segt[index*2+2]);
  }
}

//children of now
//left now*2+1
//right now*2+2
//find[ql,qr] from [l,r]
int query(int l,int r,int now,int ql,int qr){
  //cout << l <<" " <<r <<" " << ql <<"  " << qr << endl;
  if (l == ql && r == qr){
    //cout <<"find " <<  ql <<" " << qr <<" " << now <<" "<< segt[now] << endl;
    return segt[now];
  }
  int midr=(l+r)/2,midl=midr+1;//right
  //child (l-midr) and (midl-r)
  int ret=MAX_VALUE;
  if (ql <= midr)ret=min(ret,query(l,midr,now*2+1,ql,min(qr,midr)));
  if (midl <= qr)ret=min(ret,query(midl,r,now*2+2,max(midl,ql),qr));
  return ret;
}
//end of library

void init(int r,int c,int lim){
  bool isrowmajor=r<=c;
  rep(i,lim)segt[i]=MAX_VALUE;
  if (isrowmajor){
    rep(i,r){
      rep(j,c){
	update(inp[ROW(i,j,c)],ROW(i,j,c),lim);
      }
    }
  }else {
    rep(i,r){
      rep(j,c){
	update(inp[COL(i,j,r)],COL(i,j,r),lim);
      }
    }
  }
}

//int query(int l,int r,int now,int ql,int qr);
int searchmin(int r1,int c1,int r2,int c2,int r,int c,int lim){
  bool isrowmajor = r<=c;  
  int ret=INT_MAX;
  lim--;
  if (isrowmajor){
    for(int i=r1;i<=r2;i++){
      //cout << ROW(i,c1,c) <<" " << ROW(i,c2,c ) << " ; " << query(0,lim,0,ROW(i,c1,c),ROW(i,c2,c)) <<  endl;
      ret=min(ret,query(0,lim,0,ROW(i,c1,c),ROW(i,c2,c)));
    }
  }else {
    for(int j=c1;j<=c2;j++){
      ret=min(ret,query(0,lim,0,COL(r1,j,r),COL(r2,j,r)));
    }
  }
  return ret;
}

int main(){
  int r,c,q;
  while(scanf("%d%d%d",&r,&c,&q) ){
    if (r == 0 && c == 0 && q == 0)break;
    bool isrowmajor=r<=c;
    int lim=1;
    while(true){
      if (lim >= r*c)break;
      lim*=2;
    }

    /*
      rep(i,r){
      rep(j,c){
	if (isrowmajor)scanf("%d",&inp[ROW(i,j,c)]);
	else           scanf("%d",&inp[COL(i,j,r)]);
      }
    }
    */

    if (isrowmajor){
      rep(i,r){
	rep(j,c){
	  scanf("%d",&inp[ROW(i,j,c)]);
	}
      }
    }else {
      rep(i,r){
	rep(j,c){
	  scanf("%d",&inp[COL(i,j,r)]);
	}
      }
    }

    init(r,c,lim);
    //rep(i,lim)cout <<i<<" " <<  segt[i] << endl;
    rep(i,q){
      int r1,r2,c1,c2;
      scanf("%d%d%d%d",&r1,&c1,&r2,&c2);
      printf("%d\n",searchmin(r1,c1,r2,c2,r,c,lim));
    }
  }
  return false;
}