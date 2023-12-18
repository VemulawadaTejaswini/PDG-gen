import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = 0, y = 0, z = 0, p;
		for (int i = 0; i < n; i++) {
			p = sc.nextInt();
			if (a >= p) {
				x++;
			} else if (p >= b + 1) {
				z++;
			} else {
				y++;
			}
		}
		p = Math.min(x, y);
		p = Math.min(p, z);
		System.out.println(p);
	}
}
