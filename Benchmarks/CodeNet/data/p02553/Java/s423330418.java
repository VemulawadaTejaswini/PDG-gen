#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <unordered_map>

using namespace std;

#define ll long long
#define all(v) v.begin(),v.end()
#define bootstrap ios_base::sync_with_stdio(false), cin.tie(0), cout.tie(0);


void solve() {
    long a, b, c, d;
    ll n1, n2, n3, n4;
    cin >> a >> b >> c >> d;
    n1 = a * c;
    n2 = a * d;
    n3 = b * c;
    n4 = b * d;
    ll res = max(n1, n2);
    res = max(res, n3);
    res = max(res, n4);
    cout << res;
}

int main() {
    bootstrap;
    solve();
}