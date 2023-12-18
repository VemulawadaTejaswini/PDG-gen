#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int sento;
int data[1000];

void push(int);
int pop();

int main(){
  int change1;
  int change2;
  char set[100];
  sento = 0;

  while(scanf("%s",set) != EOF){
    if(set[0] == '+'){
      change1 = pop();
      change2 = pop();
      push(change1 + change2);
    }
    else if(set[0] == '-'){
      change2 = pop();
      change1 = pop();
      push(change1 - change2);
    }
    else if(set[0] == '*'){
      change1 = pop();
      change2 = pop();
      push(change1 * change2);
    }
    else{
      push(atoi(set));
    }
  }
  printf("%d\n",pop());
  return 0;
}


void push(int x){
  data[++sento] = x;
}

int pop(){
  sento--;
  return data[sento + 1];
}

