import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String s = sc.next();
		int[] count = new int[4];
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == 'K') {
				count[0]++;
			} else if (s.charAt(i) == 'U') {
				count[1]++;
			} else if (s.charAt(i) == 'P') {
				count[2]++;
			} else if (s.charAt(i) == 'C') {
				count[3]++;
			}
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 4; ++i) {
			ans = Math.min(ans, count[i]);
		}
		System.out.println(ans);
	}

}