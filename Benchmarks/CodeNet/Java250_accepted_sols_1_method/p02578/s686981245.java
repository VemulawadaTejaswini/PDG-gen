import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] a = new Long[n + 1];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextLong();
		}
		long max = 0;
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			if(max > a[i]) {
				ans += max - a[i];
			}
			if(max < a[i]) {
				max = a[i];
			}
		}
		sc.close();
		System.out.println(ans);

	}
}

