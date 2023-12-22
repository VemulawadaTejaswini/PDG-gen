import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ins = br.readLine().split(" ");
		int n = Integer.parseInt(ins[0]);
		int T = Integer.parseInt(ins[1]);

		ins = br.readLine().split(" ");
		int t[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			t[i] = Integer.parseInt(ins[i]);
		}
		br.close();

		long total = 0;
		for ( int i = 1; i < n; i++ ) {
			int diff = t[i] - t[i - 1];
			total += (diff > T) ? T : diff;
		}
		System.out.println(total + T);
	}
}