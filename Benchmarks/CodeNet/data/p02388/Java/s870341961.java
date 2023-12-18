import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Xcubic {
	public static void main(String args[]) throws IOException {
		// System.out.println("数字を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int x = Integer.parseInt(line);
		System.out.println(x * x * x);
	}
}
