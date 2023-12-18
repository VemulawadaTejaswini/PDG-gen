import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] cnt = new int[1000001];
	int[] ar = new int[n];
	for(int i = 0; i < n; i++) {
		int cur = in.nextInt();
		cnt[cur] += 1;
		ar[i] = cur;
	}
	int ans = 0;
	for(int i = 0; i < n; i++) {
		int cur = ar[i];
		if(cnt[cur] > 1) continue;
		boolean flag = true;
		for(int j = 2; j <= (int)(Math.ceil(Math.sqrt(cur))); j++) {
			if(cur % j == 0) {
				int a = j;
				int b = cur / j;
				if(a == cur) {
					continue;
				}
				if(b == cur) {
					continue;
				}

				if((cnt[a] > 0) || (cnt[b] > 0)) {
					flag = false;
					break;
				}
			}
		}
		if(flag == true) ans += 1;
	}
	if(cnt[1] > 1) {
		System.out.println("0");
	}else if(cnt[1] == 1) {
		System.out.println("1");
	}else {
		System.out.println(ans);
	}
	}
}