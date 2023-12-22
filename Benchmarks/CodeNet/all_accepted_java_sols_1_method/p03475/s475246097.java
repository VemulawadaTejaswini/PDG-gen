import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int[] c = new int[n-1];
		int[] s = new int[n-1];
		int[] f = new int[n-1];
		int[] a = new int[n];

		for (int i = 0; i < n-1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}

		for (int i = 0; i < n-1; i++) {
			int aa = 0;
			for (int j = i; j < n-1; j++) {
				int wait = 0;
				if (aa < s[j]) {
					wait += s[j] - aa;
				} else {
					wait += (f[j] - (aa % f[j])) % f[j];
				}
				aa += wait;
				aa += c[j];
			}
			a[i] = aa;
		}
		a[n-1] = 0;

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
