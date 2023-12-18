#include <stdio.h>
#include <stdlib.h>

int N = 0;
int Q = 0;
int S1[100000];
int S2[100000];
int Com = 0;
int V1 = 0;
int V2 = 0;
int V3 = 0;
void relate();
void query();
void merge();

void main(int argc,char* argv){
	int i = 0;
	scanf("%d %d",&N,&Q);
	for(i = 0; i<N ; i++){
		S1[i] = i;
		S2[i] = 0;
	}

	while(Q>0){
		scanf("%d",&Com);
		if(Com){
			scanf("%d %d",&V1, &V2);
			query();
		}else{
			scanf("%d %d %d",&V1 ,&V2, &V3);
			relate();
		}
		Q--;
	}
}

void relate(){
	//printf("R : %d %d %d\n", V1, V2, V3);
	if(S1[V1] == S1[V2]){
		return;
	}else{
		merge();
	}
}

void merge(){
	int i = 0;
	V3 = S2[V2] - V3 -S2[V1];
	V1 = S1[V1];
	V2 = S1[V2];
	for(i = 0; i<N ;i++){
		if(S1[i] == V1){
			//System.out.println("V1 = "+ V1 + "V2 = " + V2+ "V3 = " + V3);
			//printf("V1 = %d, V2 = %d, V3 = %d\n",V1, V2, V3);
			S1[i] = V2;
			S2[i] = S2[i] + V3;
			//printf("S2[%d] = %d\n", i, S2[i]);
			//System.out.println("S2[i] = "+ S2[i]);
		}else{
			continue;
		}
	}

}

void query(){
	//printf("Q : %d %d \n", V1, V2);
	if(S1[V1] == S1[V2]){
		printf("%d\n",S2[V2]-S2[V1]);
	}else{
		printf("?\n");
	}

}

