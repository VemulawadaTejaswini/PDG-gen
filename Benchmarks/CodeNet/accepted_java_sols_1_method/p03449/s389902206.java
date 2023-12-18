import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int matrix[][] = new int[2][n];
		for(int i=0; i<2; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		scan.close();
		int cur, ans = 0;
		
		for(int i=0; i<n; i++) {
			cur = 0;
			for(int j=0, k=0; j<n; j++) {
				cur += matrix[k][j];
				if(j == n-(i+1)) {
					k++;
					cur += matrix[k][j];
				}
			}
			if(cur > ans) ans = cur;
		}
		
		System.out.println(ans);
	}

}