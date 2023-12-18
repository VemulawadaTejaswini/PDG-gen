#include<iostream>
#include<vector>
#include<algorithm>
#include<string>

using namespace std;
int main()
{
	int N,X,T;
	cin >> N>>X>>T;
	if (N%X == 0) {
		cout << (N / X * T);
	}
	else {
		cout << ((N / X+1) * T);

	}
	return 0;
}