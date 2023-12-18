import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		System.out.println("Please input x:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = reader.readLine();
			int x = Integer.parseInt(s);
			System.out.println(x * x * x);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}