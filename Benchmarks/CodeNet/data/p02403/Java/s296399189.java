#include <stdio.h>

int main(void){

	int i,j,H,W;
	H = 1;
	W = 1;

	while(H!=0 || W!=0){
	scanf("%d %d",&H,&W);
		for(i=0;i<H;i++){
			for(j=0;j<W;j++){
				if(j==(W-1)){
					printf("#\n\n");
				}
				else{
					printf("#");
				}
			}
		}
	}
	return 0;