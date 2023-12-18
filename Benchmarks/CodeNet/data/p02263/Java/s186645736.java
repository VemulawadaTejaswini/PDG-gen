#include<stdio.h>
#include<stdlib.h>

void push(int);
void pop(int);

int stack[50];
int arryN = 0;

int main(){
  char input[50];
  int bre1 = 0, bre2 = 0;

  while(scanf("%50s",input) != EOF){

    if(input[0] == '+'){
      pop(1);
      bre1++;
    }
    else if(input[0] == '-'){
      pop(2);
      bre1++;
    }
    else if(input[0] == '*'){
      pop(3);
      bre1++;
    }
    else{
     push(atoi(input));
     bre2++;
    }

    if((bre1 > 99) || (bre2 > 100) || ((int)input[0] > 100000) ) break;

  }
  printf("\n%d\n",stack[0]);

  return 0;
}

void push(int input){
  stack[arryN] = input;
  arryN++;
}
void pop(int ks){
  switch(ks){
    case 1:
    stack[arryN - 2] = stack[arryN - 2] + stack[arryN - 1];
    arryN--;
    break;

    case 2:
    stack[arryN - 2] = stack[arryN - 2] - stack[arryN - 1];
    arryN--;
    break;

    case 3:
    stack[arryN - 2] = stack[arryN - 2] * stack[arryN - 1];
    arryN--;
    break;

  }
}

