import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] bi = new int[N+1], max = new int[N];
		for(int i = 0; i <= N; i++) bi[i] = sc.nextInt();
		for(int j = 0; j < N; j++) max[j] = sc.nextInt();

		long sum = 0;
		for(int i = 0; i < N; i++) {
			long x = Math.min(bi[i], max[i]);
			sum += x;
			x = Math.min(max[i]-x, bi[i+1]);
			bi[i+1] -= x;
			sum += x;
		}
		System.out.println(sum);
	}
}