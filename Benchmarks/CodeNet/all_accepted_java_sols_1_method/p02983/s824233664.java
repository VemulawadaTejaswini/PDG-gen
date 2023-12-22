import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int l = sc.nextInt();
		int r = sc.nextInt();
		if (r - l >= 2019) {
			System.out.println(0);
		} else {
			long min = Integer.MAX_VALUE;
			long a;
			for (int i = l; i < r; i++) {
				for (int j = l + 1; j <= r; j++) {
					a = ((long) i * j) % 2019;
					min = Math.min(min, a);
				}
			}
			System.out.println(min);
		}
	}
}
