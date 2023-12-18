import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++) a[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i=0; i<m; i++) b[i] = sc.nextInt();
		
		for (int i=0; i<Math.min(n,m); i++) {
			if (a[i] < b[i]) {
				System.out.println(1); return;
			}
			else if (a[i] > b[i]) {
				System.out.println(0); return;
			}
		}
		
		System.out.println(a.length<b.length?1:0);
		
	}
}
