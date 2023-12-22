import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = scan.nextInt();
		for ( int i = 1; i <= n; i++ ) {
			int x = i;
			if (x % 3 == 0) {
				sb.append(" " + i);
			} else {
				do {
					if (x % 10 == 3) {
						sb.append(" " + i);
						break;
					}
					x = x / 10;
				} while (x != 0);
			}
		}
		System.out.println(sb);
	}
}