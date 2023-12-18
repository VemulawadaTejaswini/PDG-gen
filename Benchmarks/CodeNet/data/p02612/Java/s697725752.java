#include <iostream> // cout, endl, cin
#include <string> // string, to_string, stoi
#include <vector> // vector
#include <algorithm> // min, max, swap, sort, reverse, lower_bound, upper_bound
#include <utility> // pair, make_pair
#include <tuple> // tuple, make_tuple
#include <cstdint> // int64_t, int*_t
#include <cstdio> // printf
#include <map> // map
#include <queue> // queue, priority_queue
#include <set> // set
#include <stack> // stack
#include <deque> // deque
#include <unordered_map> // unordered_map
#include <unordered_set> // unordered_set
#include <bitset> // bitset
#include <cctype> // isupper, islower, isdigit, toupper, tolower
#include <iomanip> // setprecision
#include <complex> // complex
#include <math.h> 
#include <climits> 
#include <assert.h>
#include <random>
#define rep(i,n) for(int i=0; i<(n); i++)
using namespace std;
using ll = long long;
using P = pair<int,int>;
constexpr ll INF = 1e18;
constexpr int inf = 1e9;
constexpr ll mod = 1000000007;
constexpr ll mod2 = 998244353;
const double PI = 3.1415926535897932384626433832795028841971;
const int dx[8] = {1, 0, -1, 0,1,1,-1,-1};
const int dy[8] = {0, 1, 0, -1,1,-1,1,-1};
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return 1; } return 0; }
// ---------------------------------------------------------------------------

// snukeさんのmodint
struct mint {
  ll x; // typedef long long ll;
  mint(ll x=0):x((x%mod+mod)%mod){}
  mint& operator+=(const mint a) {
    if ((x += a.x) >= mod) x -= mod;
    return *this;
  }
  mint& operator-=(const mint a) {
    if ((x += mod-a.x) >= mod) x -= mod;
    return *this;
  }
  mint& operator*=(const mint a) {
    (x *= a.x) %= mod;
    return *this;
  }
  mint operator+(const mint a) const {
    mint res(*this);
    return res+=a;
  }
  mint operator-(const mint a) const {
    mint res(*this);
    return res-=a;
  }
  mint operator*(const mint a) const {
    mint res(*this);
    return res*=a;
  }
  mint pow(ll t) const {
    if (!t) return 1;
    mint a = pow(t>>1);
    a *= a;
    if (t&1) a *= *this;
    return a;
  }

  // for prime mod
  mint inv() const {
    return pow(mod-2);
  }
  mint& operator/=(const mint a) {
    return (*this) *= a.inv();
  }
  mint operator/(const mint a) const {
    mint res(*this);
    return res/=a;
  }
};

// mint N;
//cout << N.x << endl;



int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  ll N,K;
  cin >> N >> K;
  vector<ll> pl;
  vector<ll> mn;
  bool zero = false;
  for(int i=0; i<N; i++){
    ll a;
    cin >> a;
    if(a > 0){
      pl.emplace_back(a);
    }else if(a < 0){
      mn.emplace_back(a);
    }else{
      zero = true;
    }
  }
  if(pl.size() + mn.size() < K){
    cout << 0 << "\n";
    return 0;
  }
  if(pl.size() == 0){
    if(mn.size() < K){
      cout << 0 << "\n";
      return 0;
    }
    if(K%2){
      if(zero){
        cout << 0 << "\n";
        return 0;
      }
      sort(mn.begin(),mn.end());
    }else{
      sort(mn.rbegin(),mn.rend());
    }
    mint ans = 1;
    for(int i=0; i<K; i++){
      ans *= mn[i];
    }
    cout << ans.x << "\n";
    return 0;
  }
  sort(pl.rbegin(),pl.rend());
  vector<mint> S(pl.size()+1,1);
  for(int i=0; i<pl.size(); i++){
    S[i+1] *= pl[i];
  }
  sort(mn.rbegin(),mn.rend());
  mint ans = 0;
  mint now = 1;
  for(int i=0; i<mn.size(); i+=2){
    if(i > K) break;
    if(i){
      now *= mn[i-2];
      now *= mn[i-1];
    }
    if(i+pl.size() < K) continue;
  }
  cout << ans.x << "\n";
  return 0;
}