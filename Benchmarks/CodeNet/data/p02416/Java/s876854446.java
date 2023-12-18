#include <stdio.h>
#include <string.h>

int main(void) {
  char number[1001];
  int sum, i;
  char ch;
  while(1) {
    scanf("%s", number);
    if (strcmp(number, "0") == 0) break;
    i = 0;
    sum = 0;
    while((ch = number[i]) != '\0') {
      sum += number[i] - '0';
      i++;
    }
    printf("%d", sum);
  }
  return 0;
}

