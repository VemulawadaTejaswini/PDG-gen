#include <stdio.h>
int main(){

  int num1,num2;
  int kouho[100];
  int i,j,count = 0;

  scanf("%d %d",&num1,&num2);
  
  if(num1 < num2){
    for(i = 2;i<=num1;i++){
      if(num1 % i == 0){
	kouho[count] = i;
	count++;
	  }
    }
    for(j = count;j>=0;j--){
      if(num2 % kouho[j] == 0){
	printf("%d\n",kouho[j]);
	break;
      }
    }
  }
  else if(num2 < num1){
    for(i = 2;i<=num2;i++){
      if(num2 % i == 0){
	kouho[count] = i;

	count++;
	  }
    }
    for(j = count; j>= 0;j--){
      if(num1 % kouho[j] == 0){
	printf("%d\n",kouho[j]);
	  break;
      }
    }
  }
  else if(num2 == num1){
    printf("%d\n",num2);
  }
  else{
    printf("error!");
  }
  return 0;
}
  

