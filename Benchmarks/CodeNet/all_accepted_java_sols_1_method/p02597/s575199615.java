import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int r = 0, l = s.length - 1;
		int ans = 0;
		while (r < l) {
			while(r < s.length && s[r] == 'R') r++;
			while(l >= 0 && s[l] == 'W') l--;
			if (r < l) {
				ans++;
				s[r] = 'R';
				s[l] = 'W';
			}
		}
		System.out.println(ans);
	}
}
