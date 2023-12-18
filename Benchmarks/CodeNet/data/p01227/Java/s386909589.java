#include <iostream>
#include <algorithm>
using namespace std;

int t, n, k;
int x[100010];
int d[100010];
int main(){
    cin >> t;
    while(t){
	t--;
	cin >> n >> k;
	for(int i=0;i<n;i++){
	    cin >> x[i];
	}
	int ans = x[n-1] - x[0];
	for(int i=1;i<n;i++){
	    d[i-1] = x[i] - x[i-1];
	}
	sort(d,d+n-1);
	if(n<=k){
	    ans = 0;
	}else{
	    for(int i=0;i<k-1;i++){
	        ans -= d[n-2-i];
	    }
	}
	cout << ans << endl;
    }
}
