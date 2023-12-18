#include<stdio.h>
#define Max 100000
int partition(int *,int,int);

int main(void){
  int n,i,A[Max],x;

  scanf("%d",&n);

  for(i=0;i<n;i++){
    scanf("%d",&A[i]);
  }
   x=partition(A,0,n-1);
  
   for(i=0;i<n;i++){
     if(i==x && i==n-1){
      printf("[%d]\n",A[i]);
     }
  else if(i==x){
       printf("[%d] ",A[i]);
     }
  else if(i==n-1){
    printf("%d\n",A[i]);
  }
     else 
     printf("%d ",A[i]);
   }
  return 0;
}

int partition(int A[],int p,int r){
  int x,i,j,tmp1,tmp2;

  x=A[r];
  i=p-1;
  for(j=p;j<r;j++){
    if(A[j]<=x){
      i=i+1;
    tmp1=A[i];
    A[i]=A[j];
    A[j]=tmp1;
    }
  }
    tmp2=A[i+1];
    A[i+1]=A[r];
    A[r]=tmp2;
  return i+1;
}
    

