import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		String ans = "Yes";
		for (int i = 0; i < s.length; i++) {
			boolean e = (i + 1) % 2 == 0;
			if (e && !"LUD".contains(s[i])) {
				ans = "No";
				break;
			} else if (!e && !"RUD".contains(s[i])) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}