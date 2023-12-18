import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int cost = 0;
		
		if (N >= K) {
			for (int i = 0; i < K; i++) {
				cost += X;
			}
			for (int i = K; i < N; i++) {
				cost += Y;
			}
		} else {
			for (int i = 0; i < N; i++) {
				cost += X;
			}
		}
		
		System.out.println(cost);
	}

}