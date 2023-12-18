import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][]=new int[n][m];
		int b[]=new int[m];
		int c=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				c=c+a[i][j]*b[j];
			}
			System.out.println(c);
			c=0;
		}
	}
}