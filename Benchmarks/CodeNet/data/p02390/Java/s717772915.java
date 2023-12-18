#include<stdio.h>
int main(void){
int h, m, s;
scanf("%d",&s);
	if(s > 60){
		m = s / 60;
		s = s % 60;
		if(m > 60){
			h = m / 60;
			m = m % 60;
		}
	}
printf("%d:%d:%d", h, m, s);
return 0;
}
