import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int start_zero = 0, start_one = 0;

		// starts with zero
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				start_zero += (S.charAt(i) == '0') ? 0 : 1;
			}
			else {
				start_zero += (S.charAt(i) == '1') ? 0 : 1;
			}
		}

		// starts with one
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				start_one += (S.charAt(i) == '1') ? 0 : 1;
			}
			else {
				start_one += (S.charAt(i) == '0') ? 0 : 1;
			}
		}

		System.out.println(Math.min(start_one, start_zero));
	}
}