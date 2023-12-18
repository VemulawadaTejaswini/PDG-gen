
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String pre = s.substring(0, 1);
		int ans = 1;
		int i = 1;
		while(i < s.length()) {
			String next = s.substring(i, i + 1);
			if(pre.equals(next)) {
				if(i + 1 < s.length()) {
					pre = s.substring(i, i + 2);
					i += 2;
				} else {
					ans--;
					i += 2;
				}
			} else {
				pre = next;
				i++;
			}
			ans++;
		}
		System.out.println(ans);

	}

}
