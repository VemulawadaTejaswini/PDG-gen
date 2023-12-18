#include <iostream>
#include <string>
#include <algorithm>
#include <cstdio>
#include <vector>
#include <map>
#include <functional>
#include <cmath>
#include <cstdint>
#include <mutex>
#include <thread>
#include <bitset>

using namespace std;

int main(void)
{
	int x;

	for (int i = 0; i < 5; i++)
	{
		cin >> x;
		if (x == 0)
		{
			cout << i+1;
			break;
		}
	}


	return 0;
}