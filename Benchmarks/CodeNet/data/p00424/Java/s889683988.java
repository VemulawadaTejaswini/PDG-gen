import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int n;
		while ((n = s.nextInt()) != 0) {
			String t = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			for (int i = 0; i < n; i++)	t = t.replace(s.next(), s.next());
			int m = s.nextInt();
			for (int i = 0; i < m; i++) {
				int index = h.indexOf(s.next());
				System.out.print(t.substring(index, index+1));
			}
			System.out.println("");
		}
	}
}