import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	long d[][]=new long[a][b];
	long e[][]=new long[b][c];
	long ans[][]=new long[a][c];
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			d[i][j]=scan.nextInt();
		}
	}
	for(int i=0;i<b;i++) {
		for(int j=0;j<c;j++) {
			e[i][j]=scan.nextInt();
		}
	}
	for(int i=0;i<a;i++) {
		for(int j=0;j<c;j++) {
			long C=0;
			for(int k=0;k<b;k++) {
				C+=d[i][k]*e[k][j];
			}
			ans[i][j]=C;
		}
	}for(int i=0;i<a;i++) {
		for(int j=0;j<c-1;j++) {
			System.out.print(ans[i][j]+" ");
		}
		System.out.println(ans[i][c-1]);
	}
	}
}
