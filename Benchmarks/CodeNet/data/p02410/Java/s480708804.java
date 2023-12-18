import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		int b[] = new int[m];
		int c[] = new int[n];
		for(int i=0; i<n; i++){
			c[i]=0;
			for(int j=0; j<m; j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int j=0; j<m; j++){
			b[j]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				c[i]=c[i]+(a[i][j]*b[j]);
			}
			System.out.println(c[i]);
		}
	}
}