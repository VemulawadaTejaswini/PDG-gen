#include<bits/stdc++.h>
#define ll long long
#define dl double
#define mp make_pair
#define pb push_back
using namespace std;

//***********************************************************************

// hash struct for unordered_map
struct hash_pair { 
    template <class T1, class T2> 
    size_t operator()(const pair<T1, T2>& p) const
    { 
        auto hash1 = hash<T1>{}(p.first); 
        auto hash2 = hash<T2>{}(p.second); 
        return hash1 ^ hash2; 
    } 
};

int MAXNUM = 5e3+5;
vector <int>vis(MAXNUM);
vector<int> pr;
void sieve() {
	pr.push_back(2);
	for(ll i=3;i<MAXNUM;i+=2) if(!vis[i]) {
		pr.push_back(i);
		for(ll j=i*i;j<MAXNUM;j+=2*i) vis[j]=true;
	}
}
//************************************************************************

ll mod=998244353;

void solve()
{
   ll n,s;
   cin >> n >> s;
   vector<ll> v(n);
   vector<vector<ll>> dp(n+5,vector<ll>(s+5));
   ll p=1;
   for(int i=0;i<n;i++)
   {
        cin >> v[i];
        p*=2;
        p%=mod;
        dp[i][0]=p;
   }
   dp[0][v[0]]=1;
   for(int i=1;i<n;i++)
   {
       for(int j=1;j<=s;j++)
       {
           dp[i][j]=(2*dp[i-1][j])%mod;
           if(j>=v[i])
           {
               dp[i][j]+=dp[i-1][j-v[i]];
               dp[i][j]%=mod;
           }
       }
   }
   cout << dp[n-1][s] << endl;
}


int main()
{ 
	ios_base::sync_with_stdio(false); 
    cin.tie(NULL);
	ll t;
	//cin >> t;
	t=1;
	while(t--)
	{
		solve();
	}

	return 0;
}