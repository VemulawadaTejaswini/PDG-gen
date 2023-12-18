import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		boolean[] s = new boolean[200010];
		boolean[] t = new boolean[200010];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if(a[i] == 1) s[b[i]] = true;
			if(b[i] == n) t[a[i]] = true;
		}
		for(int i = 0 ; i < 200010 ; i++) {
			if(s[i] && t[i]) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
