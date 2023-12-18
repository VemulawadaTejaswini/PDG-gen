import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int k = Integer.parseInt(br.readLine()) - 1;

		for (int i = 0; i < n; i++) {
			if (!str[k].equals(str[i])) {
				str[i] = "*";
			}
			System.out.print(str[i]);
		}
		System.out.print("\n");
	}
}
