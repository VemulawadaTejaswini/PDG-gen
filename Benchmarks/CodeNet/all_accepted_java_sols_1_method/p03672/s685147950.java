import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		label:
		for (int i = s.length - 1; i > 0; i--) {
			if (i % 2 == 0) {
				int i2 = i / 2;
				for (int j = 0; j < i2; j++) {
					if (s[j] != s[j + i2]) {
						continue label;
					}
				}
				System.out.println(i);
				return;
			}
		}
	}
}
