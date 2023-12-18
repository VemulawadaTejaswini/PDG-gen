#include <stdio.h>


int main(){
  int i,j;

  int n,cnt=0;
  int flg;


  scanf("%10000d",&n);
  int A[n];
  for(i=0;i<n;i++){
    flg = 0;
    scanf("%d",&A[i]);
    if(A[i]<2 || A[i]>100000000){
      continue;
    }

    if(A[i]<=1) break;

    for(j=2;j<A[i];j++){
      if( (A[i] % j) == 0 ){
	flg = 1;
	break;
      }
    }

     if( flg == 0) cnt ++;


  }
 
  //output
  printf("%d\n",cnt);


  return 0;
}

