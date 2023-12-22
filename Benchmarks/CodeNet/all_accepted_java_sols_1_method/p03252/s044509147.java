import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String T = scan.nextLine();
		scan.close();
		
		int len = S.length();
		char[] cngArr = new char[26];
		boolean[] useChar = new boolean[26];
		for (int i = 0; i < len; i++) {
			char c = S.charAt(i);
			int index = ((int)c) - 97;
			char c2 = T.charAt(i);

			if (cngArr[index] == '\u0000') {
				int index2 = ((int)c2) - 97;
				if (useChar[index2]) {
					System.out.print("No");
					return;
				}
				cngArr[index] = T.charAt(i);
				useChar[index2] = true;
			} else {
				if (cngArr[index] != c2) {
					System.out.print("No");
					return;
				}
			}
		}
		
		System.out.print("Yes");
	}
}
