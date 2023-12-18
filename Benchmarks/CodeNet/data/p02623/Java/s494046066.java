#include <bits/stdc++.h>

using namespace std;

void solve(){
	long long int n, m, k; cin>>n>>m>>k;
	long long int a[n], b[m];
	for(int i = 0; i < n; i++){
		cin>>a[i];
	}
	for(int i = 0; i < m; i++){
		cin>>b[i];
	}
	long long int i = 0, j = 0;
	int ans = 0;
	bool ok = true;
	while(i < n && j < m){
		if(a[i] <= b[j]){
			if((k-a[i])>=0){
				k-=a[i];
				ans++;
			} else {
				ok = false;
				break;
			}
			i++;
		} else {
			if((k-b[j])>=0){
				k-=b[j];
				ans++;
			} else {
				ok = false;
				break;
			}
			j++;
		}
	}
	if(ok){
		while(i < n && (k-a[i])>=0){
			k-=a[i];
			i++;
			ans++;
		}
		while(j < m && (k-b[j])>=0){
			k-=b[j];
			j++;
			ans++;
		}
	}
	cout << ans << "\n";
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
