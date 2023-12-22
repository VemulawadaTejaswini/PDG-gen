import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int n,m,l,a[][]=new int[100][100],b[][]=new int[100][100],i,j,k;
		long c[][]=new long[100][100];
		n=stdIn.nextInt();
		m=stdIn.nextInt();
		l=stdIn.nextInt();
		for(i=0;i<n;i++)for(j=0;j<m;j++)a[i][j]=stdIn.nextInt();
		for(i=0;i<m;i++)for(j=0;j<l;j++)b[i][j]=stdIn.nextInt();
		for(i=0;i<n;i++)for(j=0;j<l;j++)for(k=0;k<m;k++)c[i][j]+=a[i][k]*b[k][j];
		for(i=0;i<n;i++){
			for(j=0;j<l;j++){
				if(j!=0)System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}
