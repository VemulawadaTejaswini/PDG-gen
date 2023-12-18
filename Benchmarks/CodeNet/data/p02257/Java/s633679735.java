#include<stdio.h>
#include<stdlib.h>

int main(){

int num = 0;
int *data;
int i = 0;
int k = 1;
int ans = 0;
int count = 0;
int finalans = 0;

data = (int *)malloc(sizeof(int)*num);

for(i = 0;i < num;i++){
  scanf("%d",&data[i]);
  for(k = 1;k <= data[i];k++){
    ans = data[i] % k;
  if(ans == 0){
    count++;
  }
}
if(count == 2){
  finalans++;
}
count = 0;
}

printf("%d\n",finalans);
return 0;
}

