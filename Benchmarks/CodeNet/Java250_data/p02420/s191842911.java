import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int i, j, m, h, length;
		String str1, str2;
		char c1[], c2[];
		Scanner sc = new Scanner(System.in);
		while (true) {
			str1 = sc.next();
			if (str1.equals("-")) {
				break;
			}
			length = str1.length();
			m = sc.nextInt();
			for (i = 0; i < m; ++i) {
				h = sc.nextInt();
				c1 = new char[h];
				for (j = 0; j < h; ++j) {
					c1[j] = str1.charAt(j);
				}
				str2 = String.valueOf(c1);
				c2 = new char[length - h];
				int k = 0;
				for (j = h; j < length; ++j) {
					c2[k] = str1.charAt(j);
					++k;
				}
				str1 = String.valueOf(c2);
				str1 = str1 + str2;
			}
			System.out.println(str1);
		}
		sc.close();
	}
}
