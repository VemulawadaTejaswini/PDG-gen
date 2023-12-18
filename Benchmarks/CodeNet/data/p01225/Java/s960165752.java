
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int[] n = new int[9];
			for (int j = 0; j < 9; j++) n[j] = sc.nextInt();
			char[] c = new char[9];
			int b = 0;
			int g = 0;
			int r = 0;
			for (int j = 0; j < 9; j++) {
				c[j] = sc.next().charAt(0);
				switch (c[j]) {
				case 'B':
					b++;
					break;
				case 'G':
					g++;
					break;
				case 'R':
					r++;
					break;
				}
			}
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 8; k++) {
					if (c[k] > c[k + 1]) {
						int l = n[k];
						n[k] = n[k + 1];
						n[k + 1] = l;
						l = (int)c[k];
						c[k] = c[k + 1];
						c[k + 1] = (char)l;
					}
				}
			}
			for (int j = 0; j < b; j++) {
				for (int k = 0; k < b - 1; k++) {
					if (n[k] > n[k + 1]) {
						int l = n[k];
						n[k] = n[k + 1];
						n[k + 1] = l;
						l = (int)c[k];
						c[k] = c[k + 1];
						c[k + 1] = (char)l;
					}
				}
			}
			for (int j = 0; j < g; j++) {
				for (int k = b; k < b + g - 1; k++) {
					if (n[k] > n[k + 1]) {
						int l = n[k];
						n[k] = n[k + 1];
						n[k + 1] = l;
						l = (int)c[k];
						c[k] = c[k + 1];
						c[k + 1] = (char)l;
					}
				}
			}
			for (int j = 0; j < r; j++) {
				for (int k = b + g; k < b + g + r - 1; k++) {
					if (n[k] > n[k + 1]) {
						int l = n[k];
						n[k] = n[k + 1];
						n[k + 1] = l;
						l = (int)c[k];
						c[k] = c[k + 1];
						c[k + 1] = (char)l;
					}
				}
			}
			int judge = 0;
			for (int j = 0; j < 9; j += 3) {
				if (c[j + 1] == c[j] && c[j + 2] == c[j]) {
					if (n[j + 1] == n[j] && n[j + 2] == n[j] || n[j + 1] == n[j] + 1 && n[j + 2] == n[j] + 2) judge++;
				}
			}
			if (judge == 3)	System.out.println(1);
			else System.out.println(0);
		}
	}
}

