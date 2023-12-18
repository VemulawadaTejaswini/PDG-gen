import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] t = new int[n];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[][] p = new int[2][m];
		for(int i = 0; i < m; i++) {
			p[0][i] = sc.nextInt();
			p[1][i] = sc.nextInt();
		}
		
		int no;
		int sec;
		int sum;
		for(int i = 0; i < m; i++) {
			sum = 0;
			for(int j = 0; j < n; j++) {
				if(j + 1 == p[0][i]) {
					sum += p[1][i];
				} else {
					sum += t[j];
				}
			}
			System.out.println(sum);
		}

	}

}
