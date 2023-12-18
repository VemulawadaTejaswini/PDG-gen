import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	static final int MAX_E = 4001;
	static final int MAX_S = 1000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		outer:
		while ((line = br.readLine()) != null) {
			int n = parseInt(line);
			if (n == 0) {
				break;
			}

			int[] emps = new int[MAX_E];
			int idx = 0;
			long[] sales = new long[MAX_E];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int emp = parseInt(st.nextToken());
				if (sales[emp] == 0) {
					emps[idx] = emp;
					idx++;
				}
				sales[emp] += parseInt(st.nextToken()) * parseInt(st.nextToken());
			}
			int count = 0;
			for (int i = 0; ; i++) {
				if (sales[emps[i]] >= MAX_S) {
					System.out.println(emps[i]);
					count++;
				} else if (emps[i] == 0) {
					break;
				}
			}
			if (count == 0) System.out.println("NA");
		}
	}
}