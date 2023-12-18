import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scn.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			boolean bol = true;
			for (int j = 2; j < x[i]; j++) {
				if (x[i] % j == 0) {
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

