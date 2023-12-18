#include <bits/stdc++.h>
#define rep(i, n) for (ll i = 0; i < (n); ++i)
using namespace std;
using ll = long long;
using P = pair<ll, ll>;
#define chmax(x, y) x = max(x, y)
#define chmin(x, y) x = min(x, y)
#define all(x) x.begin(),x.end()
template<typename T> using min_priority_queue = priority_queue<T, vector<T>, greater<T>>;
template<typename T> T ceil(T a, T b) { return a/b + !!(a%b); }

ll x;
vector<ll>a;
struct Sieve
{
    ll n;
    vector<ll> f, primes;
    Sieve(ll n = 1) : n(n), f(n + 1)
    {
        f[0] = f[1] = -1;
        for (ll i = 2; i <= n; ++i)
        {
            if (f[i])
                continue;
            primes.push_back(i);
            f[i] = i;
            for (ll j = i * i; j <= n; j += i)
            {
                if (!f[j])
                    f[j] = i;
            }
        }
    }
};
bool isprime(ll n){
  int m=sqrt(n);
  for(int i=2;i<=m;i++){
      if(n%i==0)return false;
  }
  return true;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);

    cin>>x;
    if(x==1){
        cout<<0<<endl;
       return 0;
    }
    if(isprime(x)){
        cout<<1<<endl;
        return 0;
    }
    int m=sqrt(x);
    ll ans=0;
    for(int i=2;i<=m;i++)
    {
        if(x<i)break;
       if(isprime(i)){
           ll cur=i;
           while(x%cur==0){
               //cout<<cur<<endl;
               ans++;
               x/=cur;
               cur*=i; 
               
           }
       }
    }
    if(x>1)ans++;
    cout<<ans<<endl;
    return 0;
}
