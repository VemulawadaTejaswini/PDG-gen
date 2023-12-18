#include<stdio.h>
  int push(int);
  int pop(void);
  int stack[100];
  int stack_size=0;
int main(){
  char s[100];

  scanf("%[^\n]*s",s);
  printf("%s=%d\n",s,calc(s));
  return 0;
}

int pop(){
  if(stack_size<=0)
    return 0;
  else
    return stack[--stack_size];
}

int push(int n){
  stack[stack_size++]=n;
}

int get_number(char *s){
  int flag=0, n=0;

  if(*s=='+')
    s++;
  else if(*s=='-')
    flag=1;
    s++;

    while(*s>='0'&&*s<='9'){
      n=n*10+(*s-'0');
      s++;
    }
    
    if(flag)
      return -n;
    return n;
}

int judge(char *s){
  if(*s=='+' || *s=='-'){
    s++;
    if(*s>='0' &&*s<='9')
      return 1;
    return 0;
  }
  if(*s>='0'&&*s<='9')
    return 1;
  return 0;
}
int calc(char *s){
  int a,b,n;
  while(*s){
    if(judge(s)){
	n=get_number(s);
	push(n);
	while(*s=='+'||*s=='+'){
	  s++;
	}
	while(n){
	  n=n/10;
	  s++;
	}
    }
    else{
      switch(*s){
	
      case '+':
	a=pop();
	b=pop();
	push(b+a);
	break;

      case '-':
	a=pop();
	b=pop();
	push(b-a);
	break;

      case '*':
	a=pop();
	b=pop();
	push(b*a);
	break;
      }
      s++;
    }
  }
  return pop();
}

	

