import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		String[] str = reader.readLine().split("");
		int white = 0;
		int black = 0;
		for (int j = 0; j < N; j++) {
			if (str[j].equals(".")) {
				white++;
			}
		}
		int ans = Math.min(white, N-white);   //白と黒のうち小さいほう以下
		int ans_j = 0;
		for (int j = 0; j < N; j++) {
			if (str[j].equals("#")) {
				black++;
			}
			if (str[j].equals(".")) {
				white--;
			}
			ans_j = black + white;
			if (ans > ans_j) {
				ans = ans_j;
			}
		}
		System.out.println(ans);
	}
}