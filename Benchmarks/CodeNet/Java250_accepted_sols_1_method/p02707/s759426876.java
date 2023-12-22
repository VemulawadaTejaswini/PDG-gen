import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int value[] = new int[n];

		for (int i = 0; i < n - 1; i++) {
			int a = Integer.parseInt(str[i]);

			value[a - 1]++;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(value[i]);
		}
	}
}