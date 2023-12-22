import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	/* --------------------------------------------------------------------
	   main
	 * -------------------------------------------------------------------- */
	public static void main(String args[]) throws Exception {

		// ----- input -----
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String lines[] = input.readLine().split(" ");
		int n = Integer.parseInt(lines[0]);
		int k = Integer.parseInt(lines[1]);
		input.readLine();
		input.close();

		// ----- main -----
		int ans = 0;
		if(n <= k) {
			ans = 1;
		} else {
			ans = (int) (Math.ceil((float)(n - k) / (k - 1)) + 1);
		}
		System.out.println(ans);
	}
}
