#include <cstdio>
#include <iostream>
#include <cstring>
using namespace std;

int main() {
    string s;
    while (1){
        cin >> s;
        if (s == "0") break;
        int sum = 0;
        for (char c:s)
            sum += c - '0';
        cout << sum << endl;
    }
    return 0;
}
