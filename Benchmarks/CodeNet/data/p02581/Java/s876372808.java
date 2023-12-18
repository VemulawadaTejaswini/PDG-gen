#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n;
	scanf("%d",&n);
	int i,sum=0,a[n];
	for(i=0;i<3*n;i++)
	scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		int j,x,y,z;
		for(j=i;j<5;j++)
		{
			if(a[j]<a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		//for(j=i;j<5;j++)
		//printf("%d ",a[j]);
		//printf("\n");
		x=a[i];
		y=a[i+1];
		z=a[i+2];
		for(j=0;j<3*n;j++)
		{
			a[i]=a[i+3];
		}
		if(x==y&&x==z)
		sum++;
		//printf("%d\n",sum);
	}
	printf("%d",sum);
}

