import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String s_m = "";
		try {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				String s = reader.readLine();
				if (i == 0) {
					s_m = s;
					continue;
				}
				if (s.compareTo(s_m) < 0) {
					s_m = s;
				}
			}
			System.out.println(s_m);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}