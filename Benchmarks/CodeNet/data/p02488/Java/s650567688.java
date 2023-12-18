import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			for (int i = 0; i < n - 1; i++) {
				String str = reader.readLine();
				int x = str.compareTo(line);
				if (x < 0) {
					line = str;
					continue;
				}
			}
			System.out.println(line);
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}