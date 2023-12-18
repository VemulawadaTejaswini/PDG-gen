#include<iostream>
#include<cstring>
using namespace std;
int main(){
  int n;
  cin>>n;
  cin.ignore();
  string s;
  getline(cin,s);
  int len = s.size();
  if(len==n){
    cout<<s<<endl;
    return 0;
}
  else{
    int i=0;
    while(i<len){
      cout<<s[i];
      i++;
    }
  }
    cout<<"...";
 return 0; 
}