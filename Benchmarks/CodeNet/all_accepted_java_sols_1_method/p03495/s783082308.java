
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] count = new Integer[N];
		for (int i = 0; i < count.length; i++)
			count[i] = 0;
		for (int i = 0; i < count.length; i++) {
			count[sc.nextInt() - 1]++;
		}
		Arrays.sort(count);
		int ans = 0;
		if (N - K > 0) {
			for (int i = 0; i < N - K; i++) {
				ans += count[i];
			}
		}
		System.out.println(ans);
		sc.close();
	}
}