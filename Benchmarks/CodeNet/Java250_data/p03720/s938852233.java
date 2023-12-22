import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m + 1];
		int[] b = new int[m + 1];
		for(int i = 1; i <= m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int[] cnt = new int[n + 1];
		for(int i = 1; i <= n; i++) cnt[i] = 0;
		for(int i = 1; i <= m; i++) {
			cnt[a[i]]++;
			cnt[b[i]]++;
		}
		for(int i = 1; i <= n; i++) System.out.println(cnt[i]);
	}
}