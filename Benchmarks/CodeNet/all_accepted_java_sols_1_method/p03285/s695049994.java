import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int max4 = 100 / 4;
		int max7 = 100 / 7;

		boolean flag = false;

		for (int i = 0; i < max4; i++) {
			for (int j = 0; j < max7; j++) {
				if (n == 4 * i + 7 * j) {
					flag = true;
				}
			}
		}

		System.out.println(flag ? "Yes" : "No");

	}

}
