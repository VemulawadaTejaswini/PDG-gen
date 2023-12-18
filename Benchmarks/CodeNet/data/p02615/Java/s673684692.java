#include <bits/stdc++.h>
#include <iostream>
#include <string>

using namespace std;
int main(){
    int N;
    vector<long>arr;
    cin >> N;
    for(int i =0;i < N;i++){
        long a;
        cin >> a;
        arr.push_back(a);
    }
    long ans = 0;
    sort(arr.rbegin(),arr.rend());

    for(int i = 0;i < arr.size() - 1;i++){
        ans += arr[(i+1)/2];
    }
    cout << ans << endl;
}
