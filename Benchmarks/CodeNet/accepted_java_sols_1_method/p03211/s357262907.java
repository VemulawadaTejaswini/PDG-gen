import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < str.length() - 2; i++) {
			ans = Math.min(ans, Math.abs(753 - Integer.parseInt(str.substring(i, i + 3))));
		}
		System.out.println(ans);
	}
}
