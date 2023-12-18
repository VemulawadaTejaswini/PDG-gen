#include <stdio.h>

int main(void) {
	int n,i,j,k[10],buy;
	while (1) {
		scanf("%d",&n);
		if (n==0) break;

		for (i=0;i<10;i++) k[i] = 0;
		for (i=0;i<n;i++) {
			scanf("%d",&buy);
			k[buy]++;
		}
		for (i=0;i<10;i++) {
			if (k[i]==0) puts("-");
			else {
				for (j=0;j<k[i];j++) {
					putchar('*');
				}
				putchar('\n');
			}
		}
	}

	return 0;
}