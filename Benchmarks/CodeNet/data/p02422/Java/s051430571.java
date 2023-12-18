import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		int q = sc.nextInt();
		String order;
		int a, b;
		char[] p;
		char tmp;
		for (int i = 0; i < q; i++) {
			order = sc.next();
			a = sc.nextInt();
			b = sc.nextInt();
			switch (order) {
			case "print":
				for (int j = a; j <= b; j++) {
					System.out.print(str[j]);
				}
				System.out.printf("%n");
				break;
			case "reverse":
				for (int j = a, k = b; j < (b - a + 1) / 2; j++, k--) {
					tmp = str[j];
					str[j] = str[k];
					str[k] = tmp;
				}
				break;
			case "replace":
				p = sc.next().toCharArray();
				for (int j = a, k = 0; j <= b; j++, k++) {
					str[j] = p[k];
				}
				break;
			}
		}
		sc.close();
	}
}
