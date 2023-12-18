import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] aline = br.readLine().split(" ");

		int count = 0;

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(aline[i]);
			while (a % 2 == 0) {
				count++;
				a /= 2;
			}
		}

		System.out.println(count);

	}

}
