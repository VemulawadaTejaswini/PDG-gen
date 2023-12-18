import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int othello;
		String s[];

		while (true) {
			n = sc.nextInt();
			sc.nextLine();
			if (n == 0) {
				break;
			}
			s = sc.nextLine().split(" ");
			othello = 32;
			
			int index = 0;
			while (0 < othello) {
				othello -= (othello - 1) % 5;
				System.out.println(othello);
				othello -= Integer.valueOf(s[index]);
				if (othello < 0) {
					othello = 0;
				}
				index++;
				index %= n;
				System.out.println(othello);
			}
		}
	}
}