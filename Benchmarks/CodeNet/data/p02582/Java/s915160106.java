import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.next();
			int max = 0;
			int tmp = 0;
			for (int i = 0; i < 3; i++) {
				if (n.charAt(i) == 'R') {
					tmp++;
				}
				max = Math.max(max, tmp);
				if (n.charAt(i) == 'S') {
					tmp = 0;
				}
			}
			System.out.print(max);
		}
	}
}