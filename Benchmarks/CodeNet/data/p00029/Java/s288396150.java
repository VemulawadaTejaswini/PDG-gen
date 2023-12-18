#include <stdio.h>

int main(int argc,char* argv[]){
  int mode[100];
  int num;
  int i;
  int max = 0;
  
  for(i = 0;i < 100;i++){
    mode[i] = 0;
  }
  
  while(scanf("%d",&num) != EOF){
    mode[num-1]++;
  }
  
  for(i = 0;i < 100;i++){
    if(mode[i] > max){
      max = mode[i];
    }
  }
  
  for(i = 0;i < 100;i++){
    if(mode[i] == max){
      printf("%d\n",i+1);
    }
  }
  
  return 0;
  
}