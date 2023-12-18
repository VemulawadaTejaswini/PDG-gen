#include<iostream>
#include<string>
using namespace std;

int main(){
    int n;
    cin >> n;
   string s ; cin >> s;
   int len = s.length();
   if(len > n){
       string str = s.substr(0,n); 
       cout << str + ".."<<endl;
   }else{
       cout << s << endl;
   }
    return 0;
}