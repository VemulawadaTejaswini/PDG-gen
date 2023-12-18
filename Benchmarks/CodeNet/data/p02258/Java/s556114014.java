#include<stdio.h>
int main()
{
  int n,i,k,max=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++){
    int b=a[i];
    for(k=i+1;k<n;k++){
      if(i==0 && k==1)max=a[k]-b;
      if(a[k]-b>max)max=a[k]-b;
    }
  }
  printf("%d\n",max);
  return 0;
}
