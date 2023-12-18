import java.util.*;

public class Main {
		public static void main(String[] args) {
			int i = 0;
			int h_p = 0;
			int h_b = 0;
			int kaisu = 0;
			int max = 0;
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			h_b = scanner.nextInt();
			for (i=1; i<n; i++) {
				h_p = scanner.nextInt();
				if (h_p <= h_b) {
					kaisu++;
					if (i == n - 1) {
						if (kaisu > max) {
							max = kaisu;
						}
					}
				} else {
					if (kaisu > max) {
						max = kaisu;
					}
					kaisu = 0;
				}
				h_b = h_p;
			}
			System.out.println(max);
		}
}