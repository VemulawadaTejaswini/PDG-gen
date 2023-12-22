import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int count = 0;
		for (int i = 0; i <= n - 3; i++) {
			if (str[i].equals("A")) {
				if (str[i + 1].equals("B")) {
					if (str[i + 2].equals("C")) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}
}