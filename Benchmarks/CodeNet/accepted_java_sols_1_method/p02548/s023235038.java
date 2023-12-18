import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());

		long ans = 0;

		for (int a = 1; a < n; a++) {
			for (int b = 1; b < n; b++) {
				if (a * b >= n)
					break;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
