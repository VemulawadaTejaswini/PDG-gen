#include<stdio.h>
void noone(int[10]);

int main(void){
	int mt[10];
	int i=0;

	for(i=0; i<10; i++){

		scanf("%d",&mt[i]);//10個の配列に数値を入れる

	}

	noone(mt);//一番大きい値を決める




}

void noone(int hai[10]){
	int i=0;
	int max=0;
	int max2=0;
	int max3=0;

	hai[0]=max;

	for(i=0;i<10;i++){
		if(max<hai[i]){
			max3=max2;
			max2=max;
			max=hai[i];
		}else if(max2<hai[i]){
				max3=max2;
				max2=hai[i];
		}else if(max3<hai[i]){
				max3=hai[i];
			}
	}

	printf("%d\n%d\n%d\n",max,max2,max3);
}




