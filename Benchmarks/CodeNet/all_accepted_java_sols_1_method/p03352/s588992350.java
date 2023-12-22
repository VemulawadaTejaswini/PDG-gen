import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int i = 0;
		int j = 0;
		int max = 0;
		if (x == 1) {
			max = 1;
		} else {
			for (i = 2; i <= x; i++) {
				for (j = 2; Math.pow(i, j) <= x; j++) {
					int p = (int) Math.pow(i, j);
					if (max < p) {
						max = p;
					}
				}
			}
		}
		System.out.println(max);
	}
}
