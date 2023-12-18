import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		boolean flag;

		while (sc.hasNext()) {
			flag = true;
			String s = sc.nextLine();
			for (int i = 0; i < 10; i++) {
				a = 0;
				b = 0;
				c = 0;
				String s2 = s;
				s2 = s2.replace('X', (char)(i + '0'));
				for (int j = 0; j < s2.length(); j++) {
					a *= 10;
					a += s2.charAt(j) - '0';
					if (s2.charAt(j + 1) == '+') {
						for (int k = j + 2; k < s2.length(); k++) {
							b *= 10;
							b += s2.charAt(k) - '0';
							if (s2.charAt(k + 1) == '=') {
								for (int l = k + 2; l < s2.length(); l++) {
									c *= 10;
									c += s2.charAt(l) - '0';
								}
								break;
							}
						}
						break;
					}
				}
				if (a + b == c) {
					System.out.println(i);
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("NA");
			}
		}
	}
}