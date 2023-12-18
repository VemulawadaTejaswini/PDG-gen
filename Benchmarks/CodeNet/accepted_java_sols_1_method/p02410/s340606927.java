import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int n,m,i,j,a[][]=new int[100][100],b[]=new int[100],c[]=new int[100];
		n=stdIn.nextInt();
		m=stdIn.nextInt();
		for(i=0;i<n;i++)for(j=0;j<m;j++)a[i][j]=stdIn.nextInt();
		for(i=0;i<m;i++)b[i]=stdIn.nextInt();
		for(i=0;i<n;i++)for(j=0;j<m;j++)c[i]+=a[i][j]*b[j];
		for(i=0;i<n;i++)System.out.println(c[i]);
	}
}
