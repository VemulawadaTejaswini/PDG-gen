#include <stdio.h>
#define uint unsigned int
inline int in() {
    int x = 0, c;
    for (; (uint)((c = getchar()) - '0') >= 10; ) { if (c == '-') return -in(); if (!~c) throw ~0; }
    do { x = (x << 3) + (x << 1) + (c - '0'); } while ((uint)((c = getchar()) - '0') < 10);
    return x;
}

int main(){
	int n,S;
	while(n=in(),S=in(),(n||S)){
		int w[102]={},a[102]={};
		int ans = 0;
		for(int i = 0 ; i < n ; i++){int b; w[b=in()]++; a[b]++; }
		for(int i = 99 ; i >= 0 ; i--) w[i] += w[i+1];
		for(int i = 0 ; i <= 100 ; i++) if(2*i>S) ans+=a[i]*(a[i]-1)/2;
		for(int i = 1 ; i <= 100 ; i++) ans+=a[i]*w[i>S-i?i+1:S-i+1];
		printf("%d%c",ans,10);
	}
}