import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (65 <= c[i] && c[i] <= 90) c[i] += 32;
			else if (97 <= c[i] && c[i] <= 122) c[i] -=32;
		}
		System.out.println(String.valueOf(c));
	}
}