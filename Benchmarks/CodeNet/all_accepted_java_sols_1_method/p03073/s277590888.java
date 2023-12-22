import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String s = in.next();
			int r0 = 0;
			int r1 = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (i % 2 == 0 ^ c == '0') {
					r0++;
				} else {
					r1++;
				}
			}
			System.out.println(Math.min(r0, r1));
		}
	}

}
