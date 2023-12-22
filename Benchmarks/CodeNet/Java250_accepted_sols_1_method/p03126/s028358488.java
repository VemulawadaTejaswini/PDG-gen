import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cnt = new int[m+1];
		int i, j;
		for(i=0; i <= m; i++) cnt[i] = 0;
		for(i = 0; i < n; i++) {
			int k0 = sc.nextInt();
			for(j = 0; j < k0; j++) {
				cnt[sc.nextInt()]++;
			}
		}
		sc = null;
		int cnt2 = 0;
		for(i=1; i <= m; i++) {
			if(cnt[i] == n)	cnt2++;
		}
		System.out.println(cnt2);
	}

}
