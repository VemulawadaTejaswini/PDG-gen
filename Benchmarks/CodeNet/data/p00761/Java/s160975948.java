
#include <iostream>
#include <stdio.h>
#include <string>
#include <sstream>
#include <vector>
#include <stdlib.h>
#include <math.h>
#include <list>
#include <algorithm>

using namespace std;

int main(void){
	//FILE* fp_in = freopen("data.txt", "r", stdin);

	while( 1 ) {
		stringstream a_0;
		int a,L;
		cin >> a >> L;
		if( a == 0 && L == 0 ) break;
		a_0 << a;
		vector<int> v;
		

		while(1) {
			vector<char> ch[2];
			//頭を埋める
			for(int i = 0; i < L - a_0.str().length(); i++)
				a_0 << 0;

			int k = atoi(a_0.str().c_str());

			int ans[3] = {-1,0,0};
			for(int i = 0; i < v.size(); i++) {
				if( k == v.at(i) ) {
					ans[0] = i;
					ans[1] = k;
					ans[2] = v.size() - i;
				}
			}
			if(ans[0] != -1) {
				cout << ans[0] << " " << ans[1] << " " << ans[2] << endl;
				break;
			}

			v.push_back(atoi(a_0.str().c_str()));
			//桁を取得
			for(int i = 0; i < a_0.str().length(); i++)
				ch[0].push_back(a_0.str().at(i));
			
			sort( ch[0].begin(), ch[0].end() );

			for(int i = a_0.str().length() - 1; i >= 0; i--)
				ch[1].push_back(ch[0].at(i));

			string s[2];
			for(int i = 0; i < a_0.str().length(); i++) {
				s[0] += ch[0].at(i);
				s[1] += ch[1].at(i);
			}

			int d = atoi(s[1].c_str()) - atoi(s[0].c_str());

			a_0.clear();
			a_0.str("");
			a_0 << d;

		}
	}

	//while(1){}
	return 0;
}