#include <stdio.h>

int main(void)
{
	char a,S,H,C,D;
	int i,j,k,n,s[13],h[13],c[13],d[13];
	scanf("%d",&n);
	for(i=0;i<=12;i++)
	{
		s[i]=0;
		h[i]=0;
		c[i]=0;
		d[i]=0;
	}
	for(j=0;j<=2*n-1;j++)
	{
		scanf("%c",&a);
		if(a=='S')
		{
			scanf("%d",&i);
			s[i-1] = 1;
		}
		else if(a=='H')
		{
			scanf("%d",&i);
			h[i-1] = 1;
		}
		else if(a=='C')
		{
			scanf("%d",&i);
			c[i-1] = 1;
		}
		else if(a=='D')
		{
			scanf("%d",&i);
			d[i-1] = 1;
		}
	}
	for(i=0;i<13;i++)
	{
		if(s[i]==0)
		{
			k = i+1;
			printf("S %d\n",k);
		}
	}
	for(i=0;i<13;i++)
	{
		if(h[i]==0)
		{
			k = i+1;
			printf("H %d\n",k);
		}
	}
	for(i=0;i<13;i++)
	{
		if(c[i]==0)
		{
			k = i+1;
			printf("C %d\n",k);
		}
	}
	for(i=0;i<13;i++)
	{
		if(d[i]==0)
		{
			k = i+1;
			printf("D %d\n",k);
		}
	}
	return 0;
}