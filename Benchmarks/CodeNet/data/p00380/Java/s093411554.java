import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		Set<Integer> nsorted = new HashSet<Integer>();
		
		a[0] = sc.nextInt();
		for(int i = 1; i < n; i++) {
			a[i] = sc.nextInt();
			if(a[i - 1] > a[i]) {
				nsorted.add(i - 1);
			}
		}
		
		int q = sc.nextInt();
		int ans = -1;
		if(nsorted.isEmpty()) {
			ans = 0;
		}else {
			for(int i = 1; i <= q; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				
				int tmp = a[x];
				a[x] = a[y];
				a[y] = tmp;
				
				if(x - 1 >= 0) {
					if(a[x - 1] > a[x]) {
						nsorted.add(x - 1);
					}else {
						nsorted.remove(x - 1);
					}
				}
				if(x + 1 < n) {
					if(a[x] > a[x + 1]) {
						nsorted.add(x);
					}else {
						nsorted.remove(x);
					}
				}
				
				if(y - 1 >= 0) {
					if(a[y - 1] > a[y]) {
						nsorted.add(y - 1);
					}else {
						nsorted.remove(y - 1);
					}
				}
				if(y + 1 < n) {
					if(a[y] > a[y + 1]) {
						nsorted.add(y);
					}else {
						nsorted.remove(y);
					}
				}
				
				if(nsorted.isEmpty()) {
					ans = i;
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}
