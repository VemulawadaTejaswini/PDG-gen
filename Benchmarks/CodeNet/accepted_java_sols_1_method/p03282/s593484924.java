import java.util.Scanner;

public class Main {
	static int[] subTreeSize;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		
		if (k > s.length()) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c != '1') {
					System.out.println(c);
					return;
				}
			}
			System.out.println('1');
			return;
		} else {
			for (int i = 0; i < k; i++) {
				char c = s.charAt(i);
				if (c != '1') {
					System.out.println(c);
					return;
				}
			}
			System.out.println('1');
			return;
		}
	}
}
