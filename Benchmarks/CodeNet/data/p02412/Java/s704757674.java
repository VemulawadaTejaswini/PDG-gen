import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((line = br.readLine()) != null) {
			if (line.equals("0 0")) {
				break;
			}

			String[] arr = line.split(" ");
			int n = Integer.parseInt(arr[0]);
			int x = Integer.parseInt(arr[1]);

			int ans = 0;
			for (int i = 1; i <= n - 2; i++) {
				for (int j = i + 1; j <= n - 1; j++) {
					for (int k = j + 1; k <= n; k++) {
						if (i + j + k == x) {
							ans++;
						}
					}
				}
			}
			
			System.out.println(ans);
		}
	}

}