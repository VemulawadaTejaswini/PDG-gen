#include<iostream>
#include<climits>
#include<math.h>
#include<vector>
#include<algorithm>
#include<cstdio>
#include <string>
#include <complex>
#include <functional>
using namespace std;
typedef pair<int,int> P;
double dat[100][100];
double dp[200][100];//動的計画法
int main(){
    int a,b,cnt,tmp;
    while(cin>>a>>b,a){
        cnt=0;
        while(b){
            a%=b;
            tmp=b;
            b=a;
            a=tmp;
            cnt++;
        }
        cout<<a<<" "<<cnt<<endl;
    }
}
