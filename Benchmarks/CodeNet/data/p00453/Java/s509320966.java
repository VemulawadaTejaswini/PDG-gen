#include <iostream>
#include <vector>
#include <map>
#include <algorithm>
#include <cmath>
#include <cstring>
using namespace std;

const int INF = 1e+9;
typedef pair<int, int> P;

int memo[151][11][80];
int N, M;
vector<P> G[151];

int rec(int n, int p, int m){
	if(memo[n][p][m] != -1)
		return memo[n][p][m];
		
	int res = INF;
	if(n > N){
		return 0;
	}
	if(n == N){
		res = min(res, rec(n + 1, p, m));
	}
	if(n == N - 1 && m >= 1){
		res = min(res, rec(n + 2, p, m - 1));
	}
	if(n == 0){
		for(int i = 0; i < G[0].size(); ++i){
			res = min(res, rec(n + 1, i, m));
		}
		if(m >= 1){
			for(int i = 0; i < G[1].size(); ++i){
				res = min(res, rec(n + 2, i, m - 1));
			}
		}
	}
	else{
		for(int i = 0; i < G[n].size(); ++i){
			res = min(res, rec(n + 1, i, m) + (G[n - 1][p].second + G[n][i].second) * abs(G[n][i].first - G[n - 1][p].first));
		}
		if(n != N - 1 && m >= 1){
			for(int i = 0; i < G[n + 1].size(); ++i){
				res = min(res, rec(n + 2, i, m - 1) + (G[n - 1][p].second + G[n + 1][i].second) * abs(G[n + 1][i].first - G[n - 1][p].first));
			}
		}
	}
	return memo[n][p][m] = res;
}

int main() {
	while(cin >> N >> M && (N || M)){
		memset(memo, -1, sizeof(memo));
		for(int i = 0; i <= 150; ++i)
			G[i].clear();
		int k, d, x;
		for(int i = 0; i < N; ++i){
			scanf("%d", &k);
			for(int j = 0; j < k; ++j){
				scanf("%d%d", &d, &x);
				G[i].push_back(P(d, x));
			}
		}
		cout << rec(0, 0, M) << endl;
	}
	return 0;
}