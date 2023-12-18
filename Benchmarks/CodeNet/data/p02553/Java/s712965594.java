#include <bits/stdc++.h>
#define IOS                                                                    \
  ios::sync_with_stdio(0);                                                     \
  cin.tie(0);                                                                  \
  cout.tie(0)
#define pb push_back
#define ff first
#define ss second
#define all(x) (x).begin(), (x).end()
#define sz(x) (int)(x).size()
#define rep(i, a, b) for (int i = a; i < (b); ++i)
#define repl(i, a, b) for (ll i = a; i < (b); ++i)
#define repd(i, a, b) for (int i = b; i >= (a); --i)
#define repdl(i, a, b) for (ll i = b; i >= (a); --i)
using namespace std;
using ll = long long;
using vi = vector<int>;
using pii = pair<int, int>;
using pll = pair<ll, ll>;
const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3fLL;
const ll MOD = 1'000'000'007LL;
ll bpow(ll b, ll p, ll m = 1000000007LL) {
  ll rt = 1;
  for (; p; p >>= 1, b = b * b % m)
    if (p & 1)
      rt = rt * b % m;
  return rt;
}
int main() {
  IOS;
  ll a, b, c, d; cin >> a >> b >> c >> d;
  cout << max(a*c, max(max(a*d, b*c), b*d)) << endl;
}
