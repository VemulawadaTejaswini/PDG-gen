import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] strbfr = br.readLine().split(" ");
			int m = Integer.parseInt(strbfr[0]);
			int f = Integer.parseInt(strbfr[1]);
			int r = Integer.parseInt(strbfr[2]);
			if (m < 0 & f < 0 & r < 0) { break; }

			int sum = m + f;
			String score = null;
			if (m < 0 | f < 0) {
				score = "F";
			} else {
				if (sum >= 80) {
					score = "A";
				} else if (sum >= 65 & sum < 80) {
					score = "B";
				} else if (sum >= 50 & sum < 65) {
					score = "C";
				} else if (sum >= 30 & sum < 50) {
					if (r >= 50) {
						score = "C";
					} else {
						score = "D";
					}
				} else {
					score = "F";
				}
			}
			System.out.println(score);
		}
	}
}