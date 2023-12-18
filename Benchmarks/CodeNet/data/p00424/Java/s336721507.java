import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		String a[] = new String[100];
		String b[] = new String[100];
		String c[] = new String[10000];
		
		num1 = scanner.nextInt();
		while (num1 != 0) {
			for (int i = 0; i < num1; i++) {
				a[i] = scanner.next();
				b[i] = scanner.next();
			}
			num2 = scanner.nextInt();
			for (int i = 0; i < num2; i++) {
				c[i] = scanner.next();
				for (int j = 0; j < num1; j++) {
					if (c[i].equals(a[j])) {
						c[i] = b[j];
					}
				}
			}
			for (int i = 0; i < num2; i++) {
				System.out.print(c[i]);
			}
			System.out.println();
			num1 = scanner.nextInt();
		}
	}
}