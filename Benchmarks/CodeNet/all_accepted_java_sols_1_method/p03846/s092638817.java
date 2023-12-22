import java.util.Scanner;

public class Main {
	static final int INF = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[100001];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) b[a[i]]++;
		long ans = 1;
		boolean ok = true;
		if(n % 2 == 0) {
			for(int i = 0 ; i < n / 2 ; i++) {
				if(b[2 * i + 1] != 2) ok = false;
			}
		} else {
			for(int i = 0 ; i < n / 2 ; i++) {
				if(i == 0) {
					if(b[0] != 1) ok = false;
				} else {
					if(b[2 * i] != 2) ok = false;
				}
			}
		}
		if(ok) {
			for(int i = 0 ; i < n / 2 ; i++) {
				ans = ans * 2 % INF;
			}
		} else {
			ans = 0;
		}
		System.out.println(ans);
	}
}
