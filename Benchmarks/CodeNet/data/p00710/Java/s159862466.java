import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int r = scanner.nextInt();
		int card[] = new int[50];
		while (n > 0 && r > 0) {
			for (int i = 0; i < n; i++) {
				card[i] = n - i;
			}
			for (int r0 = 0; r0 < r; r0++) {
				int p = scanner.nextInt() - 1;
				int c = scanner.nextInt();
				int move[] = new int[c];
				for (int i = 0; i < c; i++) {
					move[i] = card[p+i];
				}
				for (int i = p-1; i >= 0; i--) {
					card[c+i] = card[i];
				}
				for (int i = 0; i < c; i++) {
					card[i] = move[i];
				}
			}
			System.out.println(card[0]);
			n = scanner.nextInt();
			r = scanner.nextInt();
		}
	}
}

