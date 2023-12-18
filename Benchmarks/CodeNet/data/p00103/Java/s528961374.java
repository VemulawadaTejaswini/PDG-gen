#include<iostream>
#include<string>
using namespace std;

int main() {
　　　int e;
　　　cin >> e;
　　　for(int i=0;i<e;i++){
　　　　　　int o=0,r=0,c=0;
　　　　　　while(1){
　　　　　　　　　string str;
　　　　　　　　　if(o==3) break;
　　　　　　　　　cin >> str;
　　　　　　　　　if(str=="HIT"){
　　　　　　　　　　　　if(r==3) c++,r--;
　　　　　　　　　　　　r++;
　　　　　　　　　}
　　　　　　　　　else if(str=="OUT") o++;
　　　　　　　　　else{
　　　　　　　　　　　　c+=r+1;
　　　　　　　　　　　　r=0;
　　　　　　　　　}
　　　}
　　　cout << c << endl;
　　　}
　　　return 0;
}