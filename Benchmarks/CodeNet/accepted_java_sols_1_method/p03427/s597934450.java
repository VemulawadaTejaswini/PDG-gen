import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int ans = Integer.parseInt(s[0]);
		boolean max = true;
		for (int i = 1; i < s.length; i++) {
			int tem = Integer.parseInt(s[i]);
			if (tem != 9) {
				max = false;
				break;
			}
			ans += tem;
		}
		if (!max) {
			ans = 0;
			for (int i = 0; i < s.length; i++) {
				if (i != 0)
					ans += 9;
				else if (i == 0)
					ans += Integer.parseInt(s[0]) - 1;
			}
		}
		System.out.println(ans);
	}
}