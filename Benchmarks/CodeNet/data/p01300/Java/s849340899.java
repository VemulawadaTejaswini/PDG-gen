import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Eleven Lover
 */
public class Main {

	static boolean mod[] = new boolean[9 * 8000 + 1];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		for (int i = 0; i < mod.length; i++) {
			if (i % 11 == 0) mod[i] = true;
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;

			int[] num = new int[line.length() + 1];
			int[] sum = new int[line.length() + 1];

			for (int i = 0; i < line.length(); i++) {
				num[i + 1] = line.charAt(i) - '0';
				if (i % 2 == 0) {
					sum[i + 1] = sum[i] + num[i + 1];
				} else {
					sum[i + 1] = sum[i] - num[i + 1];
				}
			}

			int count = 0;
			for (int i = 1; i < num.length - 1; i++) {
				if (num[i] == 0) continue;
				for (int j = i + 1; j < num.length; j++) {
					if (mod[Math.abs(sum[j] - sum[i - 1])]) count++;
				}
			}
			System.out.println(count);
		} //end while
	} //end main
}