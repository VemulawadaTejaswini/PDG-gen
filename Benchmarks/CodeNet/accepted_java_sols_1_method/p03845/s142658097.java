import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] T = new int[N];
		for(int i = 0; i < N; i++) {
			T[i] = scan.nextInt();
		}
		int M = scan.nextInt();
		int[] P = new int[M];
		int[] X = new int[M];
		for(int i = 0; i < M; i++) {
			P[i] = scan.nextInt();
			X[i] = scan.nextInt();
		}
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(P[i] - 1 == j) {
					sum += X[i];
				} else {
					sum += T[j];
				}
			}
			System.out.println(sum);
			sum = 0;
		}
		scan.close();
	}

}
