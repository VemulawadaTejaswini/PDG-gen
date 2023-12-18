#include<stdio.h>
#include<stdlib.h>
int main(){
  int i,hz,hzi;
  int *hai;
  scanf("%d",&i);
  hai=(int *)malloc(sizeof(int));
  for(int j=0;j<i;j++){
    scanf("%ld",&hai[j]);
  }
  for(j=1;j<i;j++){
    hz=hai[j];
    hzi=j-1;
    while(hzi>0 && hai[i]>hz){
      hai[hzi+1]=hai[hzi];
      hzi=hzi-1;
    }
    hai[hzi+1]=hz;
    for(int k=0;k<i;k++){
      printf("%d",hai[k]);
    }
  }
  free(hai);
  return 0;
}


