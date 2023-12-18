#include<stdio.h>
#include<string.h>
int main()
{
    int i,j=0,count=0,flag=0;
    char S[30];
    char T[30];
    scanf("%s",S);
    scanf("%s",T);
    int m=strlen(S);
    int n=strlen(T);
    for(i=0;i<m;i++)
    {
        
            if(S[i]==T[j])
            {
                count++;
                j++;
            }
      else
      {
        j++;
      }
    }
    printf("%d",count);
    return 0;
}