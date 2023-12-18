import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> H = new HashMap<String, String>();
		String h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int n;
		while ((n = s.nextInt()) != 0) {
			for (int i = 0; i < h.length(); i++)
				H.put(h.substring(i, i+1), h.substring(i, i+1));
			for (int i = 0; i < n; i++)
				H.put(s.next(), s.next());

			int m = s.nextInt();
			for (int i = 0; i < m; i++) {
				System.out.print(H.get(s.next()));
			}
			System.out.println("");
		}
	}
}