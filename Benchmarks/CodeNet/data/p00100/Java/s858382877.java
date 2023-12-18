# include <iostream>
# include <cstring>

int n;
int a[3];
int x[4001];

int main() {
	while (1) {
		std::cin >> n;
		if (n == 0)
			break;
		int count = 0;
		std::memset(x, 0, sizeof(x));
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < 3; ++j)
				std::cin >> a[j];
			x[a[0]] += a[1] * a[2];
		}
		for (int i = 1; i <= 4000; ++i) {
			if (x[i] >= 1000000) {
				std::cout << i << std::endl;
				++count;
			}
		}
		if (count==0)
			std::cout << "NA" << std::endl;
	}
	return 0;
}