#include <bits/stdc++.h>
#pragma GCC optimize("O3")
using ll = long long;
using namespace std;        
#define pb push_back
#define eb emplace_back
#define F first
#define S second
#define ar array
#define pi pair<int,int>


void solve(){
	string a,b;
	cin>>a>>b;
	int n=a.size();
	int m=b.size();
	int ans=1e9;
	for(int i=0;i<n;i++){
		if(i+m-1>n) break;
		int l=0;
		for(int j=0;j<m;j++){
			if(a[i+j]!=b[j]) l++;
		}
		ans=min(ans,l);
	}	
	cout<<ans<<endl;
	

}

int main(){
	ios_base::sync_with_stdio(false);
    	cin.tie(NULL);
//	freopen("input.txt",r,"stdin");
	int t=1;
// cin>>t;
	while(t--){
		solve();
	}
	return 0;
}



