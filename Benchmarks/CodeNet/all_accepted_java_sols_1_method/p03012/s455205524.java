import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		int[] W = new int[N];
		String[] str = reader.readLine().split(" ");
		int sum_all = 0;
		for (int i = 0; i < N; i++) {
			W[i] = Integer.parseInt(str[i]);
			sum_all += W[i];
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			int subsum = 0;
			int sum_minus = 0;
			for (int k = 0; k < i; k++) {
				sum += W[k];
			}
			subsum = sum_all - sum;
			sum_minus = Math.abs(sum - subsum);
			if (sum_minus < min) {
				min = sum_minus;
			}
		}
		System.out.println(min);
	}
}