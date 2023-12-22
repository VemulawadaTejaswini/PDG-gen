import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			char[] array = new char[10];
			int pos = 0;
			String str = s.next();
			int n = str.length();
			for (int i = 0; i < n; i++) {
				char c = str.charAt(i);
				switch (c) {
				case 'B':
					if (pos > 0) {
						pos--;
					}
					break;
				default:
					array[pos++] = c;
					break;
				}
			}
			for (int i = 0; i < pos; i++) {
				System.out.print(array[i]);
			}
			System.out.println();
		}

	}

}
