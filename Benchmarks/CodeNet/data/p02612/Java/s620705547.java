#include<stdio.h>
int main()
{
  int n,change;
  scanf("%d",&n);
 if(n>=1 && n<=10000) 
 {
   change=n%1000;
 }
  printf("%d",change);
}
