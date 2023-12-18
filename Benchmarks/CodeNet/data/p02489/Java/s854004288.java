#include <stdio.h>

int main(void) {
    int i, n;
    i = 1;
    while(scanf("%d\n", &n) == 1) {
        if(n == 0) break;

        printf("Case %d: %d\n", i, n);
        i++;
    }

     return 0;
}