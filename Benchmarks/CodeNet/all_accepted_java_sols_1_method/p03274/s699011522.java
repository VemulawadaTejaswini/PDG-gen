
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] pos = new long[n];
		long[] sum = new long[n];
		for(int i = 0; i < n; i++) {
			pos[i] = sc.nextLong();
		}
		sum[0] = 0;
		for(int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + (pos[i] - pos[i - 1]);
		}
		long ans = sum[n - 1] * 2;
		for(int i = 0; i < n - k + 1; i++) {
			long tmp = 0;
			if(Math.abs(pos[i]) < Math.abs(pos[i + k - 1])) {
				tmp = sum[i + k - 1] - sum[i] + Math.abs(pos[i]);
			} else {
				tmp = sum[i + k - 1] - sum[i] + Math.abs(pos[i + k - 1]);
			}
			ans = Math.min(ans, tmp);
		}
		System.out.println(ans);

	}

}
