import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		for(int i = 0 ; i < n ; i++) {
			w[i] = sc.nextInt();
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 1 ; i < n ; i++) {
			int s1 = 0;
			int s2 = 0;
			for(int j = 0 ; j < i ; j++) {
				s1 += w[j];
			}
			for(int j = i ; j < n ; j++) {
				s2 += w[j];
			}
			ans = Math.min(ans, Math.abs(s2 - s1));
		}
		System.out.println(ans);
		sc.close();

	}

}
