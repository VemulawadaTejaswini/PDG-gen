import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			double Z = Math.sqrt(X[i] * X[i] + Y[i] * Y[i]);
			if (Z <= D) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}