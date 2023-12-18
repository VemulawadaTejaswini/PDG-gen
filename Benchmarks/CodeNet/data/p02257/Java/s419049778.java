#include <stdio.h>

int isPrime(int);

int main(){
  int i,j;

  int n,cnt=0;


  scanf("%10000d",&n);
  int A[n];
  for(i=0;i<n;i++){
    scanf("%d",&A[i]);
    if(A[i]<2 || A[i]>100000000){
      continue;
    }


    
    cnt += isPrime(A[i]);

  


  }
 
  //output
  printf("%d\n",cnt);


  return 0;
}
int isPrime(int x){
  int i;
  
  if(x<=1) return 0;

  for(i=2;i<x;i++){
    if( x%i == 0){
      return 0;
    }
  }
  return 1;
}

