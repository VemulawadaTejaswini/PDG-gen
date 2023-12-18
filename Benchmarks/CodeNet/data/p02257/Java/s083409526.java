#include<stdio.h>

int main(){

int num = 0;
int data[num];
int i = 0;
int k = 1;
int ans = 0;
int count = 0;
int finalans = 0;

while(1){
  scanf("%d",&num);
  if(1 <= num && num <=10000){
    break;
  }
}

for(i = 0;i < num;i++){
  scanf("%d",&data[i]);
  if(2 > data[i] || data[i] > 100000000){
    break;
  }
}

for(i = 0;i < num;i++){
  for(k = 1;k <= data[i];k++){
    ans = data[i] % k;
  if(ans == 0){
    count++;
  }
}
if(count == 2){
  finalans++;
  count = 0;
}
else{
  count = 0;
}
}

printf("%d",finalans);
printf("\n");
return 0;
}

