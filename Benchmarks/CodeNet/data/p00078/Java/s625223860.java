#include <stdio.h>
#include <stdlib.h>
#define sqr(x) ((x)*(x))

int main(void) {
	int n,x,y,i,j;
	int **magic;

	while (1) {
		scanf("%d",&n);
		if (n==0) break;
		magic = (int **)calloc(n,sizeof(int *));
		for (i=0;i<n;i++) magic[i] = (int *)calloc(n,sizeof(int));
		x = n/2;
		y = n/2+1;
		for (i=1;i<=sqr(n);i++) {
			if (magic[y][x]==0) magic[y][x] = i;
			else {
				while (magic[y][x]>0) {
					x = (x+n-1)%n;
					y = (y+1)%n;
				}
				magic[y][x] = i;
			}
			x = (x+1)%n;
			y = (y+1)%n;
		}
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) printf("%4d",magic[i][j]);
			putchar('\n');
			free(magic[i]);
		}
		free(magic);
	}

	return 0;
}