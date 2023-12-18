import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int countprime = 0;
			int n = sc.nextInt();
			int[] count = new int[n];
			for (int i = 1; i <= n; i++) {
				count[i - 1] = 0;
				for (int j = 1; j <= n; j++) {
					if (i % j == 0 & j != 1) {
						count[i - 1]++;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				if (count[i] == 1) {
					countprime++;
				}
			}
			System.out.println(countprime);
		}
	}
}