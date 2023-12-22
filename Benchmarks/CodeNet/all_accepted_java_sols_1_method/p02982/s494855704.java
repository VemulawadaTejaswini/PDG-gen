import java.util.Scanner;

public class Main{
	static long a;
	static long b;
	static long x;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();

		int[][] x = new int[n][d];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				x[i][j] = scan.nextInt();
			}
		}

		int ans = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				double temp = 0.0;
				for(int k = 0; k < d; k++) {
					temp += Math.pow((x[j][k] - x[i][k]), 2);
				}
				temp = Math.pow(temp, 0.5);
				if(temp - (long)temp == 0.0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
