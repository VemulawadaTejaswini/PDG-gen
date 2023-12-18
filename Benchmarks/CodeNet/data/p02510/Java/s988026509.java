import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String ans;
				String line;
				if ((line = reader.readLine()) == "-") {
					break;
				} else {
					int m = sc.nextInt();
					for (int i = 0; i < m; i++) {
						int h = sc.nextInt();
						ans = line.substring(h) + line.substring(0, h);
						line = ans;
					}
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}