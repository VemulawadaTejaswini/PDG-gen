#include <iostream>
#include <bits/stdc++.h>

using namespace std;

void solve(){
	int n; cin>>n;
	unordered_map<int, int> mp;
	long long int s = 0;
	for(int i = 0; i < n; i++){
		int a; cin>>a;
		mp[a]++;
		s+=a;
	}
	int q; cin>>q;
	while(q--){
		int b, c; cin>>b>>c;
		if(mp.find(b) != mp.end() && mp[b]){
			s = (s - (b * mp[b]) + (c * mp[b]));
			mp[c] += mp[b];
			mp[b] = 0;
		}
		cout << s << "\n";
	}
}
int main() {
	#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
	#endif
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int t=1;
	//cin>>t;
	while(t--){
		solve();
	}
	return 0;
}
