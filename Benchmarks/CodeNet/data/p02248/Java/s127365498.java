#include <iostream>
#include <string>

using namespace std;

int main() {
    string s1, s2;
    cin >> s1 >> s2;

    for (auto i = s1.begin(); i != s1.end(); ++i) {
        auto j = s2.begin();
        auto k = i;
        while (j != s2.end() && k != s1.end()) {
            if (*k != *j) {
                break;
            }
            ++k; ++j;
        }
        if (j == s2.end()) {
            cout << distance(s1.begin(), i) << endl;
        }
    }

    return 0;
}