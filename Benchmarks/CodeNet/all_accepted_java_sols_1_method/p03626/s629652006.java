import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		long MOD = 1000000007;
		long ans = 1;
		// 一番最近見たドミノが縦のパターンの場合TRUE, それ以外はFALSE
		boolean before = false;
		for(int i = 0; i < n;) {
			if(i == 0) {
				if(s.charAt(i) == t.charAt(i)) {
					ans = 3;
					i++;
					before = true;
				} else {
					ans = 6;
					i += 2;
					before = false;
				}
			} else {
				if(before) {
					if(s.charAt(i) == t.charAt(i)) {
						ans = ans * 2 % MOD;
						i++;
						before = true;
					} else {
						ans = ans * 2 % MOD;
						i += 2;
						before = false;
					}
				} else {
					if(s.charAt(i) == t.charAt(i)) {
						i++;
						before = true;
					} else {
						ans = ans * 3 % MOD;
						i += 2;
						before = false;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
