import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int K = sc.nextInt();
		long ans = 0, st = 1, end = 1, x = 0, y = 1;
		int s = 0, t = 0;
		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i) == S.charAt(i-1))
				st++;
			else {
				s = i-1;
				break;
			}
		}
		for(int i = S.length()-1; i > 0; i--) {
			if(S.charAt(i) == S.charAt(i-1))
				end++;
			else {
				t = i;
				break;
			}
		}
		if(st == end && st == S.length()) {
			System.out.println(st*K/2);
			return;
		}
		for(int i = s+1; i < t; i++) {
			if(S.charAt(i) == S.charAt(i-1))
				y++;
			else {
				x += y / 2;
				y = 1;
			}
			if(i == t-1)
				x += y/2;
		}
		ans += x*K;
		if(S.charAt(0) == S.charAt(S.length()-1)) {
			ans += (st+end)/2*(K-1);
			ans += st/2;
			ans += end/2;
		}
		else {
			ans += st/2*K;
			ans += end/2*K;
		}
		System.out.println(ans);
		
	}

}