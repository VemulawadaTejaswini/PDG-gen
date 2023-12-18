import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int max = 0;
		int cur = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
				cur++;
			} else {
				if (cur > max) {
					max = cur;
				}
				cur = 0;
			}
		}
		if (cur > max) {
			max = cur;
		}
		System.out.println(max);
	}

}
