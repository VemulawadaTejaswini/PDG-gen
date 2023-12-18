import java.util.*;

public class Main {
	
	static final int INF = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		String s = sc.next();
		char c[] = s.toCharArray();
		int a[] = new int[n];
		for(int i=0;i<n;i++) a[i] = c[i] - '0';
		
		int now = 1;
		int cnt = 0;
		List<Integer> ls = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(now == a[i]) {
				cnt++;
			}
			else {
				ls.add(cnt);
				cnt = 1;
				now = 1 - now;
			}
		}
		ls.add(cnt);
		
		if(a[n-1] == 0) ls.add(0);
				
		int len = ls.size();
		
		if(len/2<=k) {
			System.out.println(n);
			return;
		}
		
		int sum[] = new int[len+1];
		for(int i=0;i<len;i++) sum[i+1] = sum[i] + ls.get(i);
		
		int ans = 0;
		for(int i=0;i<len;i+=2) {
			if(i + k*2 + 1 >= len + 1)break;
			ans = Math.max(ans,sum[i + k*2 + 1] - sum[i]);			
		}
		System.out.println(ans);
	}
}

