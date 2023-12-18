#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int c[109][109], n, m, p, q, r, maxn;

void dfs(vector<int>vec) {
	if (vec.size() >= 2) {
		int sum = 0;
		for (int i = 0; i < vec.size(); i++) {
			int minx = 1000009;
			for (int j = 0; j < vec.size(); j++) {
				if (i == j) continue;
				minx = min(minx, c[vec[i]][vec[j]]);
				if (minx == 0) return;
			}
			sum += minx;
		}
		maxn = max(maxn, sum);
	}
	int T = 1; if (vec.size() >= 1) T = vec[vec.size() - 1] + 1;
	for (int i = T; i <= n; i++) {
		vector<int>F = vec; F.push_back(i);
		dfs(F);
	}
}

int main() {
	cin >> n >> m;
	for (int i = 1; i <= m; i++) {
		cin >> p >> q >> r;
		c[p][q] = r; c[q][p] = r;
	}
	dfs(vector<int>{});
	cout << maxn << endl;
	return 0;
}
