#pragma GCC optimize(2)
#include<bits/stdc++.h>
#define ll long long
#define maxn 1005
#define inf 1e9
#define pb push_back
#define rep(i,a,b) for(int i=a;i<=b;i++)
#define per(i,a,b) for(int i=a;i>=b;i--)
using namespace std;

inline ll read()
{
	ll x=0,w=1; char c=getchar();
	while(c<'0'||c>'9') {if(c=='-') w=-1; c=getchar();}
	while(c<='9'&&c>='0') {x=(x<<1)+(x<<3)+c-'0'; c=getchar();}
	return w==1?x:-x;
}


int main()
{
    ll n=read();
    int ans=0;
    for(ll i=2;i*i<=n;++i){
        if(n%i==0){
            int num=0;
            while(n%i==0) num++,n=n/i;

            int l=1,r=1000,t=0;
            //printf("i:%lld num:%d\n",i,num);

            while(l<=r){
                int mid=l+r>>1;
                int res=mid*(mid+1)/2;
                if(res>=num) t=mid,r=mid-1;
                else l=mid+1;
            }
            ans+=t;

        }
    }
    if(n!=1) ans++;

    printf("%d\n",ans);
}
