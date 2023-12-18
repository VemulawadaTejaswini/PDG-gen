import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x, all = "";
		while ((x = sc.nextLine()) != null) {
			all += x;
		}
		for (char c = 'a'; c <= 'z'; c++) {
			int count = 0;
			for (int i = 0; i < all.length(); i++) {
				char ch = all.charAt(i);
				if (ch == c || ch == c - 32) {
					count++;
				}
			}
			System.out.println(c + " : " + count);
		}
	}

}