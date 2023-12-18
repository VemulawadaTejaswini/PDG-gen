import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			int[] prog, freq;
			prog = new int[n];
			freq = new int[n];

			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);

			for (int i = 0; i < n; i++) {
				prog[i] = Integer.parseInt(st.nextToken());
			}

			// 出現頻度操作
			int op = 0;
			while (true) {

				// 数え上げ
				boolean[] chk = new boolean[n];
				for (int i = 0; i < n; i++) {
					if (!chk[i]) {
						int f = 0, t = 0;
						int[] idx = new int[n];
						for (int j = 0; j < n; j++) {
							if (!chk[j] && prog[i] == prog[j]) {
								chk[j] = true;
								f++;
								idx[t] = j;
								t++;
							}
						}
						for (int j = 0; j < t; j++) {
							freq[idx[j]] = f;
						}
					}
				}
				//
				if (!Arrays.equals(prog, freq)) {
					prog = Arrays.copyOf(freq, n);
					op++;
				} else {
					break;
				}
			}
			System.out.println(op);
			if (n > 1) {
				System.out.print(freq[0]);
				for (int i = 1; i < n - 1; i++) {
					System.out.print(" " + freq[i]);
				}
				System.out.println(" " + freq[n - 1]);
			} else {
				System.out.println(freq[0]);
			}
		}
	}
}