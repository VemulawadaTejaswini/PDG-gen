import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int t = Integer.parseInt(str[2]);

		int time = 0;
		int ans = 0;

		while (time + a <= t) {
			time += a;
			ans += b;
		}

		System.out.println(ans);
	}
}
