#include <stdio.h>
#include <string.h>

int main(void)
{
	char c[1200];
	int i,j,s,k,out[26];
	for(i=0;i<26;i++) out[i]=0;
		

		fgets(c,sizeof(c),stdin);		
		for(i=0;i<strlen(c);i++){
			for(j='a',k='A',s=0;j<='z';j++,k++,s++){
				if(j==c[i] || k==c[i]) out[s]+=1;
			}
		}
		for(i='a',j=0;j<26;i++,j++)	printf("%c : %d\n",i,out[j]);
	

return 0;
}