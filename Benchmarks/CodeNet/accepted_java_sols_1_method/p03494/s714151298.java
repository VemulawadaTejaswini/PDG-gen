import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		sc = null;
		int cnt = 0;
		while(true) {
			for(j = 0; j < n; j++) {
				if(a[j] % 2 == 0) {
					a[j] >>= 1;
				} else {
					break;
				}
			}
			if(j == n) {
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}
}