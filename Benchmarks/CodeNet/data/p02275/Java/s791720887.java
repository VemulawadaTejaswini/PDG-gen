#include<stdio.h>
#include<stdlib.h>
#define Max 2000001
#define VMAX 10000
void countingsort(short *,short *,int);
//used template
int main(){
  unsigned short *A,*B;
  int n,i;
  scanf("%d",&n);
  A=(short *)malloc(sizeof(short)*n+1);
  B=(short *)malloc(sizeof(short)*n+1);
  for(i=1;i<n+1;i++){
    scanf("%d",&A[i]);
  }
  countingsort(A,B,n);
  for(i=1;i<n;i++){
    printf("%d ",B[i]);
  }
  printf("%d\n",B[i]);
  free(A);
  free(B);
  return 0;
}
void countingsort(short *A,short*B,int n){
  int i;
  short C[VMAX+1];
  for(i=0;i<VMAX;i++){
    C[i]=0;
  }
  for(i=1;i<n+1;i++){
    C[A[i]]++;
  }
  for(i=1;i<VMAX;i++){
    C[i]+=C[i-1];
  }
  for(i=n;i>0;i--){
    B[C[A[i]]]=A[i];
    C[A[i]]--;
  }
}

