import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][];
		
		a = new int[10][10];
		while (sc.hasNext()) {
			String str = sc.next();
			for (int i = 0; i < 10; i++) {
				a[0][i] = str.charAt(i) - '0';
			}
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9 - i; j++) {
					a[i + 1][j] = (a[i][j] + a[i][j + 1]) % 10;
				}
			}
			System.out.println(a[9][0]);
		}
	}
}