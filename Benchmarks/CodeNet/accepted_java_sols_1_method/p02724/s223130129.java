import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int ans = 0;
		while (x >= 500) {
			x -= 500;
			ans += 1000;
		}

		while (x >= 5) {
			x -= 5;
			ans += 5;
		}
		
		System.out.println(ans);
	}
}
