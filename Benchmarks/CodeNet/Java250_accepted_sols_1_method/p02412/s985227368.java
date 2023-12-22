import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true) {
			int cnt = 0;
			String[] line = br.readLine().split(" ");

			int n = Integer.parseInt(line[0]);
			int x = Integer.parseInt(line[1]);
			int[] set = new int[n];

			if (n == 0 && x == 0) {
				break;
			}

			for(int i = 0; i < n; i++) {
				set[i] = i + 1;
			}

			for(int j = 0; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					for (int l = k + 1; l < n; l++) {
						if(x == (set[j] + set[k] + set[l])) {
							cnt++;
						}
					}
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.print(sb);
	}
}