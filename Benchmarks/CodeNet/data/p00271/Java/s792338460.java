#include<iostream>
#include<cstdio>
using namespace std;
int main(){
  int a[10];
  int n[10],k[10];
  for(int i=0;i<7;i++){
    cin>>n[i]>>k[i];
  }
  for(int i=0;i<7;i++){
    a[i]=n[i]-k[i];
  }
  for(int i=0;i<7;i++){
    cout<<a[i]<<endl;
  }
  return 0;
}