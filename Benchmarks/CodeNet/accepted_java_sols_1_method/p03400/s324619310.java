import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int ans = x;
		for(int i = 0 ; i < n ; i++) {
			int cnt = 0;
			if(d % a[i] == 0) cnt = d / a[i];
			else cnt = (d + a[i]) / a[i];
			ans += cnt;
		}
		System.out.println(ans);
	}
}
