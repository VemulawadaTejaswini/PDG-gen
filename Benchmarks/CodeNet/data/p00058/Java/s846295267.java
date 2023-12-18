#include <iostream>
#include <cmath>
#include<cstdio>
#include <algorithm>
 
using namespace std;
 
int main(){

    double xA,yA,xB,yB,xC,yC,xD,yD;
    while(~scanf("%lf %lf %lf %lf %lf %lf %lf %lf",
        &xA,&yA,&xB,&yB,&xC,&yC,&xD,&yD)){
            if((xB-xA)*(xD-xC)+(yB-yA)*(yD-yC) == 0){
                cout << "YES" << endl;
            }else{
                cout << "NO" << endl;
            }
    }
}
