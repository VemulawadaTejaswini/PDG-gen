import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		int[][] x = new int[n][d];
		for(int i = 0;i < n; i++) {
			for(int j = 0; j <d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n-1; i++) {
			
			for(int l = i+1; l < n; l++) {
				int temp = 0;
			for(int j = 0; j < d; j++) {
				temp+=(x[i][j]-x[l][j])*(x[i][j]-x[l][j]);
			}
			for(int k = 0; k <= Math.sqrt(temp); k++) {
				int judge = k*k;
				if(judge==temp) {
					count++;

				}
			}
			}
		}
		System.out.println(count);
	}
}
