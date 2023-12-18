#include <stdio.h>
 
int main(){
  char c;
  char m;
  char s;
  int i;
  int j;
  int A[26]={0};
  while(scanf("%c", &s) != EOF){
    for(j=0,c='a',m='A';j<26;j++,c++,m++){
      if((int)s>=97&&(int)s<=122){
    if(c==s)A[(int)c-97]++;
      }else if((int)s>=65&&(int)s<=90){
    if(m==s)A[(int)m-65]++;
      }
    }
  }
  for(i=0,c='a';i<26;i++,c++){
    printf("%c : %d\n",c,A[i]);
  }
  return 0;
}