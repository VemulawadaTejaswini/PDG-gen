import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();
		int sum = h[0];
		for(int i = 0; i < N - 1; i++) {
			sum += Math.max(0, h[i + 1] - h[i]);
		}
		System.out.println(sum);
	}
}