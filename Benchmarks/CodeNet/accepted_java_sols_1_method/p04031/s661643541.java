import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		for(int i = -100 ; i <= 100 ; i++) {
			int sum = 0;
			for(int j = 0 ; j < n ; j++) {
				sum += Math.pow(i - a[j], 2);
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
