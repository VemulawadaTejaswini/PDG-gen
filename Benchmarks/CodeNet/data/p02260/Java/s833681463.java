#include <stdio.h>

int x[100];

int main(){
  int i,j;
  int tem;
  int n;
  int cnt = 0;
  int minj;

  
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&x[i]);
  }
  
 

    for(i=0;i<n-2;i++){
      minj = i;

      for(j=i;j<n-1;j++){
	if(x[j] < x[minj]){
	  minj = j;
	}
      }
      tem = x[i];
      x[i] = x[minj];
      x[minj] = tem;
      cnt++;
    
    }


    for(i=0;i<n;i++){
      printf("%d",x[i]);
      if(i<n-1){
	printf(" ");
      }
    }
    printf("\n%d\n",cnt);
    
    return 0;
  }
 

