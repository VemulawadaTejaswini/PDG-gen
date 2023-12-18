import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = reader.readLine()) != null) {
			int ans = 0;
			int n = Integer.parseInt(str);
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						for (int l = 0; l < 10; l++) {
							if (i + j + k + l == n) {
								ans++;
							}
						}
					}
				}
			}
			System.out.println(ans);
		}
		reader.close();
	}
}

