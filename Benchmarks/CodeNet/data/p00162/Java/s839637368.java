#include<iostream>
#include<math.h>
#include<vector>
#include<algorithm>
#include<cstdio>
#include <string>
#include <complex>
#include <functional>
using namespace std;
typedef pair<int,int> P;

int h[1000001];
int main(){
    h[1]=1;
    for(int i=2;i<=1000000;i*=2)h[i]=1;
    for(int i=1;i<=1000000;i++){
        if(h[i]){
            for(int j=i*3;j<=1000000;j*=3)if(h[j]==0)h[j]=2;
        }
    }
    for(int i=1;i<=1000000;i++){
        if(h[i]){
            for(int j=i*5;j<=1000000;j*=5)if(h[j]==0)h[j]=3;
        }
    }
    int a,b;
    while(scanf("%d",&a),a){
        scanf("%d",&b);
        int ret=0;
        for(int i=a;i<=b;i++)if(h[i])ret++;
        printf("%d\n",ret);
    }
}
