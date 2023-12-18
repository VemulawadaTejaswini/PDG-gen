import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[]A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int t = (D - 1) / A[i];
			sum += 1 + t;
		}
		System.out.println(sum + X);
	}
}