import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;

		n = sc.nextInt();
		String s = sc.nextLine();
		for (int i = 0; i < n; i++) {
			char c[] = sc.nextLine().toCharArray();
			for (int j = 0; j < c.length; ) {
				if (j < c.length && c[j] == 'H') {
					j++;
					if (j < c.length && c[j] == 'o') {
						j++;
						if (j < c.length && c[j] == 's') {
							j++;
							if (j < c.length && c[j] == 'h') {
								j++;
								if (j < c.length && c[j] == 'i') {
									j++;
									if (j < c.length && c[j] == 'n') {
										j++;
										if (c[j] == 'o') {
											c[j] = 'a';
										}
									}
								}
							}
						}
					}
				} else {
					j++;
				}
			}
			System.out.print(c);
			System.out.println();
		}
	}
}