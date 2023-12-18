
import java.util.Scanner;

public class Main {

	static long[] ans;
	static boolean[] seen;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		int N = in.nextInt();
		int[] bArray = new int[N + 1];
		for (int i = 0; i <= N; i += B) {
			bArray[i]++;
		}
		long ans = 0;
		for (int i = 0; i * R <= N; i++) {
			for (int j = 0; j * G + R * i <= N; j++) {
				int diff = N - (R * i + j * G);
				if (bArray[diff] != 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}