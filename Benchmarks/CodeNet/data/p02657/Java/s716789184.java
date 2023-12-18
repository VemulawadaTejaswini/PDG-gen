#include <bits/stdc++.h>
using namespace std;

#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#define rep2(i, n) for (int i = 1; i <= (int)(n); i++)
using ll = long long;
using P = pair<ll,ll>;
#define pb push_back
template<class T>bool chmax(T &a, const T &b) { if (a<b) { a=b; return 1; } return 0; }
template<class T>bool chmin(T &a, const T &b) { if (b<a) { a=b; return 1; } return 0; }

/*
 string -> int : stoi(S);
 int -> string : to_string(N);
 Sのn文字以降をm文字取り出す : S.substr(n,m)
cout << fixed << setprecision(2) << 3.14 << endl; //3.1

 int: -2,147,483,648 ～ 2,147,483,647 (2×10^9)
 ll: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (9×10^18)

*/

int main() {

  ll n, m, count=0, ans=0;
  string s;
 
  cin >> n>>m;
  
  cout << n*m << endl;
}