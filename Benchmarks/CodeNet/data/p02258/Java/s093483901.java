#include<stdio.h>
int main(){

  int i,j;
  int n,r,res;
  int min,min_n,max;
  int data[200000];

  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&data[i]);  
  }
  min=data[0];
  min_n=0;
  for(i=0;i<n;i++){
    if(min>data[i]){
      min=data[i];
      min_n=i;
    }
  }
  if(min_n==n-1){
    res=min;
    min=data[0];
    for(i=0;i<min_n;i++){
      if(min>data[i]){
	min=data[i];
      }
    }
    res-=min;
    printf("%d\n",res);
  }
  else{
    max=data[0];
    for(i=min_n;i<n;i++){
      if(max<data[i]){
	max=data[i];
      }
    }
    res=max-min;
    printf("%d\n",res);
  }
  return 0;
}

