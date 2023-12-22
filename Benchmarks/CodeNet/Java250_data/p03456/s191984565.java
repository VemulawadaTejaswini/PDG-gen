import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0] + str[1]);

		for (int i = 1; i < a / 2; i++) {
			if (i * i == a) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}