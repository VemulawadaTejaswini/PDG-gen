import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String line = sc.next();

		char[] c = line.toCharArray();

		int count = 0;
		while(true) {
			int left = -1;
			int right = -1;

			for (int i = 0; i < c.length; i++) {
				if (c[i] == 'W') {
					left = i;
					break;
				}
			}

			for (int i = c.length - 1; i >= 0; i--) {
				if (c[i] == 'R') {
					right = i;
					break;
				}
			}

			if (left == -1 || right == -1 ||left >= right) {
				break;
			}

			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			count++;
		}
		System.out.println(count);
	}
}
