import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N, K, Z = 0, F = 0;
	static int ANSWER = Integer.MAX_VALUE;
	static int[] DATA;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] lineArr = br.readLine().split(" ");
		N = Integer.parseInt(lineArr[0]);
		K = Integer.parseInt(lineArr[1]);

		DATA = new int[N];

		lineArr = br.readLine().split(" ");

		int tmp;
		for (int i = 0; i < N; i++) {
			DATA[i] = Integer.parseInt(lineArr[i]);
			tmp = Integer.parseInt(lineArr[i]);

			if (tmp < 0) {
				F++;
			} else if (tmp == 0) {
				Z++;
			}

			DATA[i] = tmp;
		}

		int start = 0;
		if (F > K) {
			start = F - K + Z;
		}

		int startValue;
		int endValue;
		for (int i = start; i < N - K + 1; i++) {
			startValue = DATA[i];
			endValue = DATA[i + K - 1];

			tmp = endValue - startValue;
			tmp += Math.min(Math.abs(startValue), Math.abs(endValue));

			if (ANSWER > tmp) {
				ANSWER = tmp;
			}
		}

		System.out.println(ANSWER);

	}
}