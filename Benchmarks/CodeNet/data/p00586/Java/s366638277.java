#include <stdio.h>

int main(int argc, const char * argv[])
{

    int a, b;
    
    while (scanf("%d %d\n", &a, &b) != EOF) {
        printf("%d\n", a + b);
    }
    
    return 0;
}