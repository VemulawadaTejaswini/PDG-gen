import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.next();
			int len = n.length();
			int amari = 0;
			for (int i = 0; i < len; i++) {
				int keta = Integer.parseInt(n.substring(i, i + 1));
				amari = (amari + keta) % 9;
			}
			if (amari % 9 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}