#include<stdio.h>
int main(void){

	int a=0,b=0;
	int sum=0;
	int count=0;

	scanf("%d %d",&a,&b);

	sum=a+b;

	while(sum!=0){
		sum=sum/10;
		count++;
	}

	printf("%d",count);
	return 0;
}

