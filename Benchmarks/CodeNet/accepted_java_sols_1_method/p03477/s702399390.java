import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] cut = x.split(" ");

		int a = Integer.parseInt(cut[0]);
		int b = Integer.parseInt(cut[1]);
		int c = Integer.parseInt(cut[2]);
		int d = Integer.parseInt(cut[3]);

		String ans = "=";

		if ((a + b) > (c + d)) {
			ans = "Left";
		} else if ((a + b) < (c + d)) {
			ans = "Right" + "";
		} else {
			ans = "Balanced";
		}
		System.out.println(ans);
	}
}