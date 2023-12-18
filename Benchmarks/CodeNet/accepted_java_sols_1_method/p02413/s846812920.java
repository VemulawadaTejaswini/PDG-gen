import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r =sc.nextInt();
		int c =sc.nextInt();
		int[][] A = new int[r + 1][c + 1];
		int sum = 0;
		for(int i = 0; i < r; i++) {
			sum = 0;
			for(int j = 0; j < c; j++) {
				A[i][j] = sc.nextInt();
				sum += A[i][j];
			}
		A[i][c] = sum;
		}
		for(int j = 0; j < c + 1; j++) {
			sum = 0;
			for(int i = 0; i < r; i++) {
				sum += A[i][j];
			}
			A[r][j] = sum;
		}
		for(int i = 0; i < r + 1; i++) {
			for(int j = 0; j < c + 1; j++) {
				System.out.print(A[i][j]);
				if(j == c) { System.out.println(""); break;}
				System.out.print(" ");
			}
		}
	}
}

