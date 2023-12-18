#include <stdio.h>
#include <math.h>
#define N 10000
int main(){
  int i,j,n,count;
  int kazu;

  scanf("%d",&n);
  count = n;

  for(i=0;i<n;i++){
    scanf("%d",&kazu);
    if(kazu == 2){
      continue;
    }
    if(kazu%2==0){
      count--;
      continue;
    }
    for(j=3;j<=sqrt(kazu);j+=2){
      if(kazu%j==0){
	break;
      }
      count--;
    }
  }

  printf("%d\n",count);

  return 0;
}

