import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		char[] s = S.toCharArray();
		for (char ss : s) {
			int test = ss;
			int byteNum = test + N;
			if (byteNum > 90) {
				byteNum -= 26;
			}
			System.out.print((char) byteNum);
		}
		sc.close();
	}
}