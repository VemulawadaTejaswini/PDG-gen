import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int INF = 1000000007;
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		if(n % 2 == 0) {
			boolean ok = true;
			for(int i = 0 ; i < n ; i += 2) {
				if(a[i] == i + 1 && a[i + 1] == i + 1);
				else ok = false;
			}
			if(ok) {
				long temp = n / 2;
				long ans = 1;
				for(int i = 0 ; i < temp ; i++) {
					ans = ans * 2 % INF;
				}
				System.out.println(ans);
			} else {
				System.out.println(0);
			}
		} else {
			boolean ok = true;
			if(a[0] == 0) {
				for(int i = 1 ; i < n ; i += 2) {
					if(a[i] == i + 1 && a[i + 1] == i + 1);
					else ok = false;
				}
			} else ok = false;
			if(ok) {
				long temp = (n - 1) / 2;
				long ans = 1;
				for(int i = 0 ; i < temp ; i++) {
					ans = ans * 2 % INF;
				}
				System.out.println(ans);
			} else {
				System.out.println(0);
			}
		}
	}
}
