#include <bits/stdc++.h>

using namespace std;

void solve(){
	long long int n; cin>>n;
	int category = 0;
	long long int temp = n;
	while(temp>=1){
		category++;
		temp/=26;
	}
	std::vector<char> v(category);
	char a[27] = {' ','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	for(int i = category-1; i >= 0; i--){
		v[i] = a[n%26];
		n/=26;
	}
	for(char c : v){
		cout << c;
	}
	cout << "\n";
}

int main(){
	#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
	#endif
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int t=1;
	while(t--){
		solve();
	}
	return 0;
}
