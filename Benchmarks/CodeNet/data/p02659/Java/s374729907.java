#include<iostream>
#include<cmath>
#include<stack>
#include<vector>
#include<cstring>
#include<algorithm>
#include<set>
#include<queue>
#include <vector>
#include <list>
#include <map>
#include <set>
#include <deque>
#include <stack>
#include <bitset>
#include <algorithm>
#include <functional>
#include <numeric>
#include <utility>
#include <complex>
#include <sstream>
#include <iomanip>
#include <cstdio>
#include <cmath>
#include <cstdlib>
#include <cstring>
#include <ctime>
#include <cassert>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
const int inf =0x3f3f3f3f;
#define scn(a) scanf("%d",&a)
#define scd(a) scanf("%lf",&a)
#define scl(a) scanf("%lld",&a)
#define ptf(a) printf("%d\n",a)
#define mes(a,b) memset(a,b,sizeof(a))
#define fon(s,n) for(int i=s;i<=n;i++)
#define range(i,a,b) for(int i=a;i<=b;++i)
#define rerange(i,a,b) for(int i=a;i>=b;--i)
#define maxn 1000010
const int S=20;
ll gcd(ll a,ll b) { return b>0 ? gcd(b,a%b):a;}
ll lcm(ll a,ll b){return a*b/gcd(a,b);}
ll q_pow(ll a,ll b,ll mod)
{
	ll ans=1,res=a;
	while(b){
		if(b&1) ans=ans*res%mod;
		res=res*res%mod;
		b>>=1;
	}
	return ans%mod;
}
ll qmul(ll a,ll b,ll p){
     ll d=0,t=a;
    while(b>0)
    {
        if(b&1) d=(d+t)%p;
        b=b/2;
        t=(t+t)%p;
    }
    return d;

}

ll qmod(ll a,ll b,ll p)//快速幂
{
    ll d=1,t=a;
    while(b)
    {
        if(b&1)
            d=qmul(d,t,p)%p;
        t=qmul(t,t,p)%p;
        b>>=1;
    }return d;
}
int exgcd(int a,int b,int& x,int& y)
{
	if(!b){
		x=1;y=0;
		return a;
	}
	int d=exgcd(b,a%b,y,x);
	y-=(a/b)*x;
	return d;
}

int del[105];

int main(){
    ll a;
    double b;
    scanf("%lld%lf", &a, &b);
    b = a*(b*100)/100;
    printf("%lld\n", (ll)b);
    return 0;
}