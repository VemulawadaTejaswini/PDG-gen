import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i  < n ; i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0 ;; i++) {
			boolean ok = true;
			for(int j = 0 ; j < n ; j++) {
				if(a[j] % 2 != 0) {
					ok = false;
				}
			}
			if(ok) {
				ans++;
				for(int k = 0 ; k < n ;  k++) {
					a[k] /= 2;
				}
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
