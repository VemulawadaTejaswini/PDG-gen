import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0) {
			for (int i = 0; i < n; ++i) {
				int pm = sc.nextInt();
				int pe = sc.nextInt();
				int pj = sc.nextInt();
				if (pm > 99 || pe > 99 || pj > 99) {
					System.out.println("A");
				} else if (pm + pe >= 180) {
					System.out.println("A");
				} else if (pm + pe + pj >= 240) {
					System.out.println("A");
				} else if (pm + pe + pj >= 210) {
					System.out.println("B");
				} else if (pm + pe + pj >= 150 && (pm >= 80 || pe >= 80)) {
					System.out.println("B");
				} else {
					System.out.println("C");
				}
			}
			n = sc.nextInt();
		}
	}
}

