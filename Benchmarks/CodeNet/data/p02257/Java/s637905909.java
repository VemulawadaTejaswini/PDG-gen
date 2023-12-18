import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {
			int v = scn.nextInt();
			boolean bol = true;
			for (int j = 2; j < v; j++) {
				if (v % j == 0) {
					bol = false;
					break;
				}
			}
			if (bol) {
				count++;
			}
		}
		System.out.println(count);
	}
}

