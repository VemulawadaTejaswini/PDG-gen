import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)
	        throws IOException {
		BufferedReader br = new BufferedReader(
		        new InputStreamReader(System.in));
		int v = Integer.parseInt(br.readLine());
		int m = 100000;
		for (int i = 0; i < v; i++) {
			m *= 1.05;
			if ((m % 1000) > 0) {
				m += 1000 - m % 1000;
			}
		}
		System.out.println(m);
	}
}