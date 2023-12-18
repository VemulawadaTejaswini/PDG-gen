import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int add = 0, sub = 0;
		for (; !isPalin(n + add); ++add) ;
		for (; !isPalin(n - sub); ++sub) ;
		int ans = n - sub;
		if ( add < sub ) {
			ans = n + add;
		}
		System.out.println(ans);
	}

	static boolean isPalin(int x) {
		String str = Integer.toString(x);
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}