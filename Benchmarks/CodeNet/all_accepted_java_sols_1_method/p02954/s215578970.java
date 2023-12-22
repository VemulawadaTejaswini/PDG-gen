import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		StringBuilder sb = new StringBuilder(S);
		int[] ans = new int[sb.length()];
		for (int i = 0; i < sb.length();) {
			int index = i;
			int right = 0;
			while (index < sb.length() && sb.charAt(index) == 'R') {
				right++;
				index++;
			}
			int left = 0;
			while (index < sb.length() && sb.charAt(index) == 'L') {
				left++;
				index++;
			}
			ans[i + right - 1] = 1 + (right - 1) / 2 + ((left - 1) / 2 + (left - 1) % 2);
			ans[i + right] = 1 + (left - 1) / 2 + ((right - 1) / 2 + (right - 1) % 2);
			i = index;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		in.close();
	}
}