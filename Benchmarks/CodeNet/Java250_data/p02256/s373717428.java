import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int x = Integer.parseInt(str[0]), y = Integer.parseInt(str[1]), rest;

		if (x < y) {
			int temp = x;
			x = y;
			y = temp;
		}

		do {
			rest = x % y;
			x = y;
			y = rest;
		} while (y != 0);

		System.out.println(x);
	}
}