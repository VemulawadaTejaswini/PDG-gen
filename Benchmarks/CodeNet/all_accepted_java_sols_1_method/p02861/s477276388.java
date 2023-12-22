import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[2][N];
		for(int i = 0; i < N; i++) {
			A[0][i] = sc.nextInt();
			A[1][i] = sc.nextInt();
		}
		double sum = 0;
		for(int i = 0; i <= N-2; i++) {
			for(int j = i+1; j <= N-1; j++) {
				sum += (double)(Math.sqrt(Math.pow(A[0][i]-A[0][j], 2) + Math.pow(A[1][i]-A[1][j], 2)));	
			}
		}
		System.out.println(2*sum/N);
	}

}
