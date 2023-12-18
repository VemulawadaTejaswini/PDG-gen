import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String s = in.next();
		String t = in.next();
		int ans = N;
		for (int i = 0; i < s.length(); i++) {
			int index = i;
			boolean isOk = true;
			for (int j = 0; j < t.length() && index < s.length(); j++) {
				if (s.charAt(index) != t.charAt(j)) {
					isOk = false;
					break;
				}
				index++;
			}
			if (!isOk) {
				ans++;
			} else {
				ans = N + i;
				break;
			}
		}
		System.out.println(ans);
		in.close();
	}
}