import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char[] taps = sc.next().toCharArray();
			for (int i = 0; i < taps.length; i++) {
				if (i % 2 != 0 && taps[i] == 'R') {
					System.out.println("No");
					return;
				}
				if (i % 2 == 0 && taps[i] == 'L') {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
	}
}