import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		char[] a = line.toCharArray();

		for (int i = 0; i < a.length; i += 2) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}
}
