import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long x = Long.parseLong(br.readLine());

		double yokin = 100.0;

		long ans = 0;
		while (yokin < x) {
			yokin += Math.floor(yokin / 100);
			ans++;
		}
		System.out.println(ans);
	}
}
