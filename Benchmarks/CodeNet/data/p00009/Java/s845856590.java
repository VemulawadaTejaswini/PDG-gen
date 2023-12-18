#include <iostream>
using namespace std;
int main(void){
	bool a[600001];
	while(!cin.eof()){
		int n;
		cin >> n;

		for(int i = 2; i <= n; i++){
			a[i] = true;
		}

		for(int i = 2; i * i <= n; i++){
			if(!a[i]) continue;
			for(int j = i + 1; j <= n; j++)
				if(!(j % i)){
					a[j] = false;
				}
		}

		int ans = 0;
		for(int i = 2; i <= n; i++)
			if(a[i]){
				ans++;
			}
		cout << ans << endl;
	}
			
	return 0;
}