import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int d = Integer.parseInt(str[3]);
		int e = Integer.parseInt(str[4]);

		if (a == 0) {
			System.out.println("1");
		} else if (b == 0) {
			System.out.println("2");
		} else if (c == 0) {
			System.out.println("3");
		} else if (d == 0) {
			System.out.println("4");
		} else if (e == 0) {
			System.out.println("5");
		}
	}
}
