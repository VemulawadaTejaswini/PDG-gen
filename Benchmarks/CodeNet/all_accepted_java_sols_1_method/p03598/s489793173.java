import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] x = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			x[i] = sc.nextInt();
		}
		
		int d = 0;
		
		for(int i = 1; i <= N; i++) {
			d += 2 * Math.min(Math.abs(x[i] - K), x[i]);
		}
		System.out.println(d);
	}
}
