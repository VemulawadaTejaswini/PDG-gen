import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		String[] s = new String[n];
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
			if(s[i].substring(0, 1).equals("B") &&s[i].substring(s[i].length()-1, s[i].length()).equals("A")) {
				cnt1 ++;
			}else if(s[i].substring(0, 1).equals("B")) {
				cnt2 ++;
			}else if(s[i].substring(s[i].length()-1, s[i].length()).equals("A")) {
				cnt3 ++;
			}
		}
		if(cnt1 == 0) {
			ans += cnt1 + Math.min(cnt2, cnt3);
		}else if(cnt2 + cnt3!= 0) {
			ans += cnt1 + Math.min(cnt2, cnt3);
		}else {
			ans += cnt1-1;
		}
		String[] t = new String[n];
		for(int i = 0; i < n; i++) {
			t[i] = s[i];
			t[i] = t[i].replace("AB", "X");
			ans += s[i].length() - t[i].length();
		}
		System.out.println(ans);
		sc.close();
	}
}
