#include<stdio.h>
int main()
{
  char c[1000]="",k;
  scanf("%d\n",&k);
  scanf("%s\n",c);
  int i,s=0;
  for(i=0;c[i]!='\0';i++)
  {
      s++;
  }
  
      if(k<s){
          for(i=0;i<k;i++)
          {
              printf("%c",c[i]);
          }
          printf("...");
      }
      else
      {
          
          for(i=0;i<k;i++)
          {
              printf("%c",c[i]);
          }
      }
    
  }
 
 