import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		long T = reader.nextLong();
		long ans = T;
		long[] arr = new long[N];
		arr[0] = reader.nextLong();
		for (int i = 1; i < N; i++) {
			arr[i] = reader.nextLong();
			ans += Math.min(T, arr[i]-arr[i-1]);
		}

		System.out.println(ans);
		reader.close();

	}
}