#include <stdio.h>

void main (void); 





void main(void){
    int i=0;
    int x=0;
    int j = 0;
    char f[256]="z";
    char s1[256]="";
    scanf("%d",&x);


    for(j;j<x;j++){
        scanf("%s",s1);

        i=0;
        

        if(strcmp(f,s1)==1){
            strcpy(f,s1);

        }


    }
    printf("%s\n",f);
}