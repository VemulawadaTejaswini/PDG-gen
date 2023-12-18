import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)
	        throws IOException {
		BufferedReader br = new BufferedReader(
		        new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
}