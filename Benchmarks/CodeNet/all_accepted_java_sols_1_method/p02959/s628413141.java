import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			Integer[] a = new Integer[n + 1];
			Integer[] b = new Integer[n];
			for(int i = 0 ; i < n + 1 ; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0 ; i < n ; i++) {
				b[i] = sc.nextInt();
			}
			long ans = 0;
			int zan = a[0];
			for(int i = 0 ; i < n ; i++) {
				if(zan < b[i]) {
					b[i] -= zan;
					ans += zan;
					if(a[i + 1] < b[i]) {
						ans += a[i + 1];
						zan = 0;
					} else {
						ans += b[i];
						zan = a[i + 1] - b[i];
					}
				} else {
					ans += b[i];
					zan = a[i + 1];
				}
			}
			System.out.println(ans);

		}
	}

}
