import java.util.*;
import java.io.*;

class Main{
    static int q;
    static int A[][];
    static int p[];
    static int m[][];
    public static void main(String args[]){
	int i,j,k=1,n=0,ans=0;
	A = new int[100][100];
	m = new int[100][100];
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	p = new int[n+1];

	for(i=0;i<n;i++){
	    for(j=0;j<2;j++){
		A[i][j] = scan.nextInt();
	    }
	    if(i==0){
		p[0] = A[0][0];
	    }
	    p[k] = A[i][1];
	    k++;
	}
	matrixChainOrder(p);
	System.out.println(m[1][n]);
    }

    static void matrixChainOrder(int p[]){
	int n,i,j,k,l;
	n = p.length-1;
	for(i=1;i<=n;i++){
	    m[i][i] = 0;
	}
	for(l=2;l<=n;l++){
	    for(i=1;i<=n-l+1;i++){
		j = i+l-1;
		m[i][j] = 2147483647;
		for(k=i;k<=j-1;k++){
		    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
		    m[i][j] = min(m[i][j],q);
		}
	    }
	}
    }

    static int min(int x,int y){
	if(x<y){
	    return x;
	}
	else {
	    return y;
	}
    }
}

