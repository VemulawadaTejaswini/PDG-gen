#include<stdio.h>
#include<stdlib.h>
int main(void)
{
	int a, b, x = 0, y = 0, r = 0;
	int w = 0;//横
	int h = 0;//縦
	scanf("%d %d %d %d %d\n", &w, &h, &x, &y, &r);
	a = x + r;
	b = y + r;
	if(0 <= a && a <= w){
		if(0 <= b && b <= h){
			printf("Yes\n");
		}
		else
		{
			printf("NO\n");
		}
	}
	else
	{
		printf("NO\n");
	}
	return 0;
}
