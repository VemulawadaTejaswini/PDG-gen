import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			int n = Integer.parseInt(arr[0]);
			int x = Integer.parseInt(arr[1]);
			if (n == 0 && x == 0)
				break;

			int cnt = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					for (int k = j + 1; k <= n; k++) {
						if (i + j + k == x)
							cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}