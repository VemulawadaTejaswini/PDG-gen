import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[][] X = new int[N][4];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 4; j++) {
				X[i][j] = stdIn.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(X[i][2] - 5 > 0) {
				if(X[i][3] - 2 > 0) {
					System.out.println((X[i][0]*X[i][2] + X[i][1] * X[i][3]) * 0.8);
				}
				else {
					if((X[i][0] * X[i][2] + X[i][1] * 2) * 0.8 < X[i][0] * X[i][2] + X[i][1] + X[i][3]) {
						System.out.println((X[i][0] * X[i][2] + X[i][1] * 2) * 0.8);
					}
					else {
						System.out.println(X[i][0] * X[i][2] + X[i][1] * X[i][3]);
					}
				}
			}
			else if(X[i][3] - 2 > 0) {
				if((X[i][0] * 5 + X[i][1] * X[i][3]) * 0.8 < X[i][0] * X[i][2] + X[i][1] + X[i][3]) {
					System.out.println((X[i][0] * 5 + X[i][1] * X[i][3]) * 0.8);
				}
				else {
					System.out.println(X[i][0] * X[i][2] + X[i][1] * X[i][3]);
				}
			}
			else {
				if((X[i][0] * 5 + X[i][1] * 2) * 0.8 < X[i][0] * X[i][2] + X[i][1] + X[i][3]) {
					System.out.println((X[i][0] * 5 + X[i][1] * 2) * 0.8);
				}
				else {
					System.out.println(X[i][0] * X[i][2] + X[i][1] * X[i][3]);
				}
			}
		}
	}
		
}