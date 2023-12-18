#define _USE_MATH_DEFINES
#include<stdio.h>
#include<math.h>
int main(void){
	float r, m=M_PI, men, en;
	scanf("%f", &r);
	men = r*r*m;
	en = (r * 2)*m;
	printf("%.6f %.6f\n", men, en);
	return 0;
}