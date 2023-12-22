import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, x, i, j, k, count;
		while (true) {
			n = stdIn.nextInt();
			x = stdIn.nextInt();
			count=0;
			if (n == 0 && x == 0) {
				break;
			}
			for (i = 1; i <= n; i++) {
				for (j = i+1; j < n; j++) {
					for (k = j+1; k <= n; k++) {
						if (i + j + k == x) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
		stdIn.close();
	}
}

