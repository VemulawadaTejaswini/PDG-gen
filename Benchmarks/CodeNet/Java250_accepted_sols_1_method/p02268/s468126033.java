import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[114514];
		
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		int q = scan.nextInt();
		int ans = 0;
		for (int i=0; i<q; i++) {
			int key = scan.nextInt();
			int ng = -1; int ok = n;
			while (Math.abs(ok-ng) > 1) {
				int mid = (ok+ng)/2;
				if (a[mid] >= key) ok = mid;
				else ng = mid;
			}
			if (a[ok]==key) ans++;
		}
		
		System.out.println(ans);
	}
}


