#include <stdio.h>
int main(void)
{
	int goukei, i, n;
	scanf("%d", &goukei);
	for(i = 0; i < 9; i++){
		scanf("%d", &n);
		goukei = goukei - n;
		}
	printf("%d\n", goukei);
	return 0;
}

