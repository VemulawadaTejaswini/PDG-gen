import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char c[];

		c = sc.nextLine().toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a') {
				if (i + 1 < c.length && c[i + 1] == 'p') {
					if (i + 2 < c.length && c[i + 2] == 'p') {
						if (i + 3 < c.length && c[i + 3] == 'l') {
							if (i + 4 < c.length && c[i + 4] == 'e') {
								c[i] = 'p';
								c[i + 1] = 'e';
								c[i + 2] = 'a';
								c[i + 3] = 'c';
								c[i + 4] = 'h';
							}
						}
					}
				}
			} else if (c[i] == 'p') {
				if (i + 1 < c.length && c[i + 1] == 'e') {
					if (i + 2 < c.length && c[i + 2] == 'a') {
						if (i + 3 < c.length && c[i + 3] == 'c') {
							if (i + 4 < c.length && c[i + 4] == 'h') {
								c[i] = 'a';
								c[i + 1] = 'p';
								c[i + 2] = 'p';
								c[i + 3] = 'l';
								c[i + 4] = 'e';
							}
						}
					}
				}
			}
		}
		System.out.println((char[])c);
	}
}