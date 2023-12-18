&#65279;//dinic
//accepted by 820
//accepted by 10249
//accepted by rose 2096//main not here because use long long...
//accepte by rose 1163
//accepted by 10330
#include<iostream>
#include<queue>
 
using namespace std;
//for maximum flow
const int N = 2000;
#define INF (1 << 21)//#define INF (1LL << 60)
#define REP(i,b,n) for(int i=b;i<n;i++)
#define rep(i,n) REP(i,0,n)
int cap[N][N];
bool visited[N];
int parent[N];
int flow[N][N];
int layer[N];
 
void make_layer(int n,int s,int t){
  queue<int> Q;
  Q.push(s);
  layer[s]=0;
  while(!Q.empty()){
    int now = Q.front();Q.pop();
    rep(i,n){
      if ( cap[now][i]-flow[now][i]>0 &&layer[i]==-1){
        layer[i]=layer[now]+1;
        Q.push(i);
      }
    }
  }
}
 
int augment(int now,int t,int n,int f){
  if ( now == t||f==0)return f;
  if ( visited[now])return 0;
  visited[now]=true;
  rep(i,n){
    if ( layer[now]<layer[i] ){
      int tmp= augment(i,t,n,min(f,cap[now][i]-flow[now][i]));
      if ( tmp > 0){
        flow[now][i]+=tmp;
        flow[i][now]=-flow[now][i];
        visited[now]=false;
        return tmp;
      }
    }
  }
  return 0;
}
 
int dinic(int n,int s,int t){
  int ansflow=0;
  bool flag=true;
  rep(i,n)rep(j,n)flow[i][j]=0;
  while(flag){
    fill(layer,layer+n,-1);
    fill(visited,visited+n,false);
    flag = false;
    //make layer
    make_layer(n,s,t);
    if (layer[t]==-1)break;//if no such path to go to sink
 
    //find blocking flow
    for(int f=1;f;flag=true){
      f = augment(s,t,n,INF);
      if ( f == 0)break;
      ansflow+=f;
    }
  }
  return ansflow;
}
//end maximum flow




const int dx[]={0,0,1,-1};
const int dy[]={1,-1,0,0};
 
inline int getval(int i,int j,int c){
  return i*c+j;
}
 
main(){
  int r,c;
  while(cin>>r>>c && r){
    int n=2*(r*c)+2;
    int in=0,out=r*c,src=2*r*c,dst=src+1;
    rep(i,n){
      rep(j,n)cap[i][j]=0;
    }
    int cnt=0;
    rep(i,r){
      rep(j,c){
        cap[src][in+getval(i,j,c)]=1;
        cap[out+getval(i,j,c)][dst]=1;
        rep(k,4){
          int nex=j+dx[k],ney=i+dy[k];
          if (nex==-1||ney==-1||nex==c||ney==r)continue;
          //cout << getval(i,j,c)<<" " << getval(ney,nex,c) << endl;
          cnt++;
          cap[in+getval(i,j,c)][out+getval(ney,nex,c)]=1;
        }
      }
    }


    int ans=dinic(n,src,dst);
    //cout <<"node " << n <<" edge " << cnt << endl;
    //cout << n*n*cnt << endl;
    //cout << ans << " " << r*c << endl;
    if (ans == r*c)cout << "yes"<<endl;
    else cout <<"no"<<endl;
  }
  return false;
}