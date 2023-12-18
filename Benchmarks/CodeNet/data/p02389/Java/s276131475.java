#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(){
    int n,b;
    scanf("%d",&n);
    scanf("%d",&b);
    int sc = n*b;
    int li = 2*(n+b);
    printf("%d %d\n",sc,li);
    return 0;
}
