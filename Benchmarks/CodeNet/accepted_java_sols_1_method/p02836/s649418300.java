import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int len = s.length();
		int len2 = len / 2;
		String s2;
		String s3;

		if (len % 2 == 0) {
			s2 = s.substring(0, len2);
			s3 = s.substring(len2 , len);
		} else {
			s2 = s.substring(0, len2);
			s3 = s.substring(len2 + 1, len);
		}

		int k = 0;
		int t=len2-1;

		for (int y = 0; y < len2;) {
			char ch1 = s2.charAt(y);
			char ch2 = s3.charAt(t);

			if (ch1 != ch2) {
				k++;
			}
			++y;
			--t;
		}
		System.out.println(k);
	}
}