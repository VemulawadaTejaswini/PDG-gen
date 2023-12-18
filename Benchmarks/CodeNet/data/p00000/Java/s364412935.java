#include<cstdio>
#include<iostream>
#include<cstdlib>
#include<algorithm>
#include<vector>
#include<map>
#include<set>
#include<queue>
#include<stack>
#include<cstring>
#include<string>
#include<ctime>
#include<cmath>
using namespace std;
typedef long long llong;

struct edge{
	int k,next,ans,id;
};
const int SN = 502000;
edge e1[SN*2],e2[SN*2];
int f1[SN],f[SN],f2[SN];
bool bi[SN];
int n,root,p1,p2,nn,mm;

int s(int k){
	if (f[k]) return (f[k]=s(f[k]));
	else return k;
}

void addedge(int p,int q){
	e1[++nn].k=q;
	e1[nn].next=f1[p];
	f1[p]=nn;
}

void addedge1(int p,int q,int id){
	e2[++mm].k=q;
	e2[mm].next=f2[p];
	e2[mm].id=id;
	e2[mm].ans=0;
	f2[p]=mm;
}

void tarjan(int k){
	for (int i=f1[k];i;i=e1[i].next){
		tarjan(e1[i].k);
		f[s(e1[i].k)]=k;
	}
	bi[k]=true;
	for (int i=f2[k];i;i=e2[i].next)
	 if (bi[e2[i].k]) e2[i].ans=s(e2[i].k);
}

struct Node
{
    int tree,root;
    bool incir;
    int cirid,dep;
    int fa;
}P[500010];
int Mark[500010],Cnt;
bool Vis[500010];
int DFS(int Now)
{
    Mark[Now]=Cnt;
    Vis[Now]=true;
    if (Vis[P[Now].fa])
    {
        if (Mark[P[Now].fa]==Cnt)
        {
            P[Now].tree=Cnt;
            P[Now].incir=true;
            P[Now].cirid=1;
            P[Now].root=Now;
            P[Now].dep=1;
            return P[Now].fa;
        }
        else
        {
            P[Now].tree=P[P[Now].fa].tree;
            P[Now].root=P[P[Now].fa].root;
            P[Now].dep=P[P[Now].fa].dep+1;
            return -1;
        }
    }
    else
    {
        int tmp=DFS(P[Now].fa);
        if (tmp<0)
        {
            P[Now].tree=P[P[Now].fa].tree;
            P[Now].root=P[P[Now].fa].root;
            P[Now].dep=P[P[Now].fa].dep+1;
            return -1;
        }
        else if (tmp==Now)
        {
            P[Now].tree=P[P[Now].fa].tree;
            P[Now].root=Now;
            P[Now].incir=true;
            P[Now].cirid=P[P[Now].fa].cirid+1;
            P[Now].dep=1;
            return -1;
        }
        else
        {
            P[Now].tree=P[P[Now].fa].tree;
            P[Now].incir=true;
            P[Now].root=Now;
            P[Now].dep=1;
            P[Now].cirid=P[P[Now].fa].cirid+1;
            return tmp;
        }
    }
}
int main()
{
    int N,Q,i;
    while (~scanf("%d%d",&N,&Q))
    {
        for (i=1;i<=N;i++)
        {
            scanf("%d",&P[i].fa);
            Vis[i]=false;
            P[i].incir=false;
            Mark[i]=-1;
        }
        Cnt=1;
        for (i=1;i<=N;++i) if (!Vis[i])
        {
            DFS(i);
            Cnt++;
        }
        memset(f1,0,sizeof(f1));
		memset(f2,0,sizeof(f2));
		memset(f,0,sizeof(f));
		memset(bi,true,sizeof(bi));
		nn=mm=0;
		
		for (int i=1;i<=n;++i) addedge1(fa[i],i);
		
        /*
        while (~scanf("%d",&i))
        {
            if (P[i].incir)
            {
                printf("%d is in circle, tree: %d, circle id: %d\n",i,P[i].tree,P[i].cirid);
            }
            else
            {
                printf("%d is on root: %d, tree: %d, depth: %d\n",i,P[i].root,P[i].tree,P[i].dep);
            }
        }
        */
    }
}