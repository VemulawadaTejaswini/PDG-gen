import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[][]a = new int [n][m];
		int[]b = new int [m];
		int[]d = new int [n];
		
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m ; j++) {
				a[i][j] = sc.nextInt();
				d[i] += b[j]*a[i][j];
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if((d[i] + c) > 0) {
				count++;
			}
		}
		System.out.println(count);


	}

}
