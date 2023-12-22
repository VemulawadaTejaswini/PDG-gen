import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int profit = 0;
		int[][] vc = new int [2][N];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++) {
				vc[i][j] = sc.nextInt();
			}
		}
		
		for( int j = 0; j < N; j++) {
			if(vc[0][j] - vc[1][j] > 0) {
				profit += vc[0][j] - vc[1][j];
			}
		}
		System.out.println(profit);
	}
}