#include<iostream>
#include<algorithm>
#include<cstring>
 
using namespace std;
const int N=100010;
int a[N],b[N],rt[N*20],ls[N*20],rs[N*20],sum[N*20],vis[N*20];
 
int id;
void build(int &o,int l,int r)
{
	o=++id;
	sum[o]=0;
	if(l==r) return;
	int m=(l+r)>>1;
	build(ls[o],l,m);
	build(rs[o],m+1,r);
}
 
void update(int &o,int l,int r,int last,int pos,int val)
{
	o=++id;
	ls[o]=ls[last];
	rs[o]=rs[last];
	sum[o]=sum[last]+val;
	if(l==r) return;
	int m=(l+r)>>1;
	if(pos<=m)
	  update(ls[o],l,m,ls[last],pos,val);
	else
	  update(rs[o],m+1,r,rs[last],pos,val);
}
//查询区间[L,R]内小于等于k的个数 
int query(int pos,int root,int l,int r)
{
	if(l==r)
	  return sum[root];
	int m=(l+r)>>1;
	if(m>=pos)
	  return sum[rs[root]]+query(pos,ls[root],l,m);
	else
	  return query(pos,rs[root],m+1,r);
}
 
int main()
{
	int T,n,q,l,r,k;
 	memset(vis,0,sizeof(vis));
  	scanf("%d%d",&n,&q);
 	 for(int i=1;i<=n;i++)
   	 scanf("%d",&a[i]);
 	 	id=0;
  	build(rt[0],1,n);
 	 for(int i=1;i<=n;i++){
    if(!vis[a[i]])//如果a[i]还未出现过 
      update(rt[i],1,n,rt[i-1],i,1);
    else{//如果a[i]已经出现了 
      int pos=vis[a[i]];
      int temp;
      update(temp,1,n,rt[i-1],pos,-1);
      update(rt[i],1,n,temp,i,1);
    }
    vis[a[i]]=i;
  }
  while(q--){
    scanf("%d%d",&l,&r);
    int num=query(l,rt[r],1,n);
    printf("%d\n",num);
  }
	return 0;
}