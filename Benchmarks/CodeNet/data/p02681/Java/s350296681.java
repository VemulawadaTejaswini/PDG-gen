#include <bits/stdc++.h>
2 using namespace std;
3
4 string S, T;
5 void input() {
6 cin >> S >> T;
7 }
8
9 void solve() {
10 T.pop_back();
11 if(S == T) cout << "Yes" << endl;
12 else cout << "No" << endl;
13 }
14
15 int main() {
16 input();
17 solve();
18 return 0;
19 }