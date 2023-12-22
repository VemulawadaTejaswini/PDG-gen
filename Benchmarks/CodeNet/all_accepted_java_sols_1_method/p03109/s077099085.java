import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("/");

		int y = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int d = Integer.parseInt(str[2]);

		if (y <= 2019) {
			if (m == 4 && d <= 30) {
				System.out.println("Heisei");
			} else {
				if (m <= 3) {
					System.out.println("Heisei");
				} else {
					System.out.println("TBD");
				}
			}
		} else {
			System.out.println("TBD");
		}
	}
}