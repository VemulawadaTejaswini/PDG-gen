import java.util.*;

public class MainA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		String[] strs = new String[n];
		String[] strss = new String[n];
		for (int i = 0; i < n; i++) {
			strs[i] = sc.next();
			strss[i] = strs[i] + strs[i];
		}
		int r = 0;
		for (int i = 0; i < n; i++)
			if (strss[i].contains(str))
				r++;
		System.out.println(r);
		sc.close();
	}
}