import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		int Q = Integer.parseInt(str[2]);
		int[] kaisuu = new int[N];
		int[] score = new int[N];

		for (int i = 0; i < Q; i++) {
			String line = reader.readLine();
			int num = Integer.parseInt(line) - 1;
			kaisuu[num]++;
		}
		for (int i = 0; i < N; i++) {
			score[i] = K - Q + kaisuu[i];
			//System.out.println("score=" + score[i]);        ////////////////////
			if (score[i] > 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}
