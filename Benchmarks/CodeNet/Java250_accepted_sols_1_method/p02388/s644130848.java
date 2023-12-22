import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int x = Integer.parseInt(reader.readLine());
		int ans = x * x * x;
		System.out.println(ans);
	}
}