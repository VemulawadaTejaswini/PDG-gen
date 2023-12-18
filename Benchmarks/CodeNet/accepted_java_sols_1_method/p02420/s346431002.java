import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.next();
			if (str.equals("-"))
				break;
			int m = sc.nextInt();
			int sum = 0;
			int[] x = new int[m];
			for (int i = 0; i < m; i++) {
				x[i] = sc.nextInt();
				sum += x[i];
			}
			int a = sum % str.length();
			System.out.printf("%s%s\n", str.substring(a), str.substring(0, a));
		}
	}

}
