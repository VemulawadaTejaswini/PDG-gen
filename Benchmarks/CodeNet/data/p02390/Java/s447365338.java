#include <iostream>
using namespace std;
 
int main() {
    int S;
    cin >> S;
    int h = S / 3600;
    int m = S / 60 - 60 * h;
    int s = S - 3600 * h - 60 * m;
 
    cout << h << ":" << m << ":" << s << endl;
}