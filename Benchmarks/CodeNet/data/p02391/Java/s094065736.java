import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print() throws IOException {
		int a;
		int b;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ", 0);
		a = Integer.parseInt(num[0]);
		b = Integer.parseInt(num[1]);

		compare(a, b);
	}

	private static void compare(int a, int b) {
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else if (a == b) {
			System.out.println("a == b");
		}
	}

}