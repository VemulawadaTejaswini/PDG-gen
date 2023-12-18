import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			char[] c = Double.toString((double) a / b).toCharArray();
			int i = 0;
			int s = 0;
			for (i = 0; i < c.length; i++)
				if (c[i] == '.')
					break;
			if (i == c.length)
				System.out.println(0);
			for (int j = i + 1; j < c.length && n-- > 0; j++) {
				s += (c[j] - '0');
			}
			System.out.println(s);
		}
	}
}