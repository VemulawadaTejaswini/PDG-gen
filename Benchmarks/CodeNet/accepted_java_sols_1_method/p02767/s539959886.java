import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] x = new int[n];
			for(int i = 0 ; i < n ; i++) {
				x[i] = sc.nextInt();
			}
			int ans = Integer.MAX_VALUE;
			for(int i = 1 ; i <= 100 ; i++) {
				int p = 0;
				for(int j = 0 ; j < n ; j++) {
					p += (x[j] - i) * (x[j] - i);
				}
				ans = Math.min(ans, p);
			}
			System.out.println(ans);
		}

	}

}
