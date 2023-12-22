
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split("");

		for (int i = 0; i < s.length(); i++) {
			String x = array[i];
			if (x.equals(",")) {
				System.out.print(" ");
			} else {
				System.out.print(x);
			}
		}
		System.out.println("");
	}
}
