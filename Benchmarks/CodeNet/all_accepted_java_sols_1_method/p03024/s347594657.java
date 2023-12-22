import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int maru = 0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='o') {
				maru++;
			}
		}
		maru +=15-s.length();
		if (maru>=8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}