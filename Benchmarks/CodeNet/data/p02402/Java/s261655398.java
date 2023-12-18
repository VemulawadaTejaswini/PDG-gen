#include <stdio.h>
long long main(void)
{
	int i,n,box[10001],temp,max=0,min=0,sum;
	scanf("%d",&n);
	
	for(i=0;i<n;i++){
		scanf("%d",&box[i]);
	}
	sum = 0.0;
	max=min=box[0];
	for(i=0;i<n;i++){
		if(box[i]>max)
		max=box[i];
		if(box[i]<min)
		min=box[i];
		sum += box[i];
	}
		
printf("%d %d %d\n",min,max,sum);
	return 0;
}
