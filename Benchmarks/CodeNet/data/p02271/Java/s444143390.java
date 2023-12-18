#include <stdio.h>
#define N 20
#define Q 200
#define T 1
#define F 0
int A[N],n;

int main()
{
  int q,i,judge;
  int M[Q];

  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&A[i]);
  }
  scanf("%d",&q);
  for(i=0;i<q;i++){
    scanf("%d",&M[i]);
  }
  for(i=0;i<q;i++){
    judge = solve(0,M[i]);
    if(judge == T){
      printf("yes\n");
    }
    if(judge == F){
      printf("no\n");
    }
  }

  return 0;
}


int solve(int i,int m){
  int res;
  if(m==0){
    return T;
  }
  if(i>=n){
    return F;
  }
  res = solve(i+1,m) || solve(i+1,m-A[i]);
    return res;
  
}
  

