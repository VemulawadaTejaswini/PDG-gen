import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int c = 1;
		int n;
		try {
			while ((n = Integer.parseInt(br.readLine())) != 0) {
				System.out.println("Case " + c + ": " + n);
				c++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}