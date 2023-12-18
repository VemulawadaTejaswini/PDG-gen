#include <stdio.h>

int main(int argc, char const *argv[])
{
	int table[100+1][100+1]={};
	int r, c;
	int i, j;


	scanf("%d %d", &r, &c);

	for(i=0; i<r; i++) {
		for(j=0; j<c; j++) {
			scanf("%d", &table[i][j]);
			table[i][c] += table[i][j];
		}
	}

	for(j=0; j<=c; j++) {
		for(i = 0; i<r; i++) {
			table[r][j] += table[i][j];
		}
	}



	for(i=0; i<=r; i++) {
		for(j=0; j<=c; j++) {
			printf("%d ", table[i][j]);
		}
			printf("\n");
	}

	return 0;
}
