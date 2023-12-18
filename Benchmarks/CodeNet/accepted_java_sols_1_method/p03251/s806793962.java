import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int[] x = new int[N+1];
		int[] y = new int[M+1];

		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}

		int minY = 100;
		int maxX = -100;
		x[N] = X;
		y[M] = Y;
		
		for(int i = 0; i <= N; i++) {
			maxX = Math.max(maxX, x[i]);
		}
		for(int i = 0; i <= M; i++) {
			minY = Math.min(minY, y[i]);
		}
		
		if(maxX < minY) {
			System.out.println("No War");
		}else {
			System.out.println("War");
		}
	}
}
