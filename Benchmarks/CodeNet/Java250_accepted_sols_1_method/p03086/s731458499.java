import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int tmp = 0;
		int ans = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'A' || c[i] == 'C' || c[i] == 'G' || c[i] == 'T') {
				tmp++;
			} else {
				ans = Math.max(ans, tmp);
				tmp = 0;
			}
		}
		ans = Math.max(ans, tmp);
		System.out.println(ans);
		sc.close();
	}
}