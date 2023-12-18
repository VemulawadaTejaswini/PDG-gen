#include <iostream>
#include <algorithm>
#include <cmath>
#include <string>
#include <vector>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <bitset>
#include <cassert>

using lint = int64_t;

using std::cin;    using std::cout;    using std::endl;
using std::sort;   using std::reverse;
using std::max;    using std::min;
using std::string;
using std::vector;
using std::pair;
using std::map;
using std::set;
using std::queue;
using std::stack;

#define low std::lower_bound
#define upp std::upper_bound
#define rep(i, n)  for (lint i = 0; i < (n); ++i)
#define rep1(i, n) for (lint i = 1; i < (n); ++i)
#define Rep(i, n)  for (lint i = (n); i >= 0; --i)
#define all(vec) (vec.begin(), vec.end())
#define cend printf("\n")

using P = pair<lint, lint>;
using D = pair<double, double>;
//constexpr lint mod = 998'244'353LL;
constexpr lint mod = 1000'000'007LL;
constexpr lint inf = 7LL * mod * mod;
const double Pi = 2.0 * acos(0.0);

template<class T> using prique     = std::priority_queue<T>;
template<class T> using prique_inv = std::priority_queue<T, vector<T>, std::greater<T>>;
template<class T> inline bool chmax(T& a, const T& b) {
	if (a < b) {
		a = b;
		return true;
	}
	return false;
}
template<class T> inline bool chmin(T& a, const T& b) {
	if (a > b) {
		a = b;
		return true;
	}
	return false;
}

constexpr lint gcd(lint a, lint b) { return b == 0 ? a : gcd(b, a % b); }
constexpr lint lcm(lint a, lint b) { return a / gcd(a, b) * b; }

constexpr bool pri(lint p) {
	for (lint i = 2; i * i <= p; i == 2 ? ++i : i += 2) if (p % i == 0) return false;
	return p > 1;
}

constexpr lint digit(lint x) {
	lint res = 0;
	while (x != 0) x /= 10, ++res;
	return res;
}

constexpr bool cross(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
	double ta = (cx - dx) * (ay - cy) + (cy - dy) * (cx - ax);
	double tb = (cx - dx) * (by - cy) + (cy - dy) * (cx - bx);
	double tc = (ax - bx) * (cy - ay) + (ay - by) * (ax - cx);
	double td = (ax - bx) * (dy - ay) + (ay - by) * (ax - dx);

	return ta * tb < -1e-12 && tc * td < -1e-12;
}

double dis(D a, D b) noexcept { return std::hypot(a.first - b.first, a.second - b.second); }

lint fact[3000000];
void f_init(lint n) noexcept {
	if (3000000 <= n) return;
	fact[0] = fact[1] = 1;
	for (lint i = 2; i <= n; ++i) {
		fact[i] = i * fact[i - 1];
		if (mod <= fact[i]) fact[i] %= mod;
	}
}

lint nck[1010][1010];
void comb(lint n) noexcept {
	if (1010 <= n) return;
	for (lint i = 0; i < n - 1; ++i) {
		for (lint j = 0; j < i + 1; ++j) {
			if (i == 0 || j == 0) nck[i][j] = 1;
			else nck[i][j] = nck[i - 1][j - 1] + nck[i - 1][j];
		}
	}
}

lint modpow(lint x, lint n, lint m) noexcept {
	lint res = 1;
	while (n > 0) {
		if (n & 1) {
			res *= x;
			if (m <= res) res %= m;
		}
		x *= x;
		if (m <= x) x %= m;
		n >>= 1;
	}
	return res;
}

lint comb(lint n, lint r) noexcept {
	if (r < 0 || n < r) return 0;
	if (r == 0 || r == n) return 1;
	if (r == 1 || r == n - 1) return n;
	lint res = fact[n] * modpow(fact[n - r], mod - 2, mod) % mod * modpow(fact[r], mod - 2, mod) % mod;
	return res < 0 ? res + mod : res;
}

map<lint, lint> factring(lint n) noexcept {
	map<lint, lint> res;
	for (lint i = 2; i * i <= n; ++i) {
		while (n % i == 0) {
			n /= i;
			++res[i];
		}
	}
	if (n != 1) ++res[n];
	return res;
}

class union_find {
private:
	static const lint array_size = 2 * 100010;
	lint par[array_size], rank[array_size], size[array_size];

public:
	void init(lint n) noexcept {
		if (array_size <= n) return;
		for (lint i = 0; i < n; ++i) {
			par[i] = i;
			rank[i] = 0;
			size[i] = 1;
		}
	}

	lint root(lint x) noexcept {
		if (par[x] == x) return x;
		return par[x] = root(par[x]);
	}

	bool same(lint x, lint y) noexcept { return root(x) == root(y); }

	void unite(lint x, lint y) noexcept {
		x = root(x); y = root(y);
		if (x == y) return;
		if (rank[x] < rank[y]) {
			par[x] = y;
			size[y] += size[x];
		}
		else {
			par[y] = x;
			if (rank[x] == rank[y]) ++rank[x];
			size[x] += size[y];
		}
	}
};

int main() {
	int h1, h2, m1, m2, k;
	cin >> h1 >> m1 >> h2 >> m2 >> k;
	cout << 60 * (h2 - h1) + (m2 - m1) - k << endl;
}