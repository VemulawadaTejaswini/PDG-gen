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
			int[] prog;
			prog = new int[n];

			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);

			for (int i = 0; i < n; i++) {
				prog[i] = Integer.parseInt(st.nextToken());
			}

			// 出現頻度操作
			int op = 0;
			while (true) {

				// 数え上げ
				int[] freq = new int[n];
				boolean[] chk = new boolean[n];

				for (int i = 0; i < n; i++) {
					if (!chk[i]) {
						int f = 1, t = 1;
						int[] idx = new int[n];
						chk[i] = true;
						idx[0] = i;
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
					prog = freq;
					op++;
				} else {
					prog = freq;
					break;
				}
			}
			System.out.println(op);
			for (int i = 0; i < n; i++) {
				if (i != n - 1) {
					System.out.print(prog[i] + " ");
				} else
					System.out.println(prog[i]);
			}
		}
	}
}