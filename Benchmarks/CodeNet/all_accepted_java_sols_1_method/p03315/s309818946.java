import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] s = new char[4];

		for (int i=0; i< 4 ; i++) {
			s[i] = S.charAt(i);
		}

		int image = 0;
		for (char a : s) {
			if (("+").equals(String.valueOf(a))) {
				image++;
			} else {
				image--;
			}
		}
		System.out.println(image);
	}
}
