import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] s = in.next().toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i] + n >= 0 && s[i] + n < 26) {
				char tmp = s[i];
				tmp += n;
				System.out.print(tmp);
			} else {
				int num = (s[i] - 'A' + n) % 26;
				char tmp = 'A';
				tmp += num;
				System.out.print(tmp);
			}
		}
		System.out.println();
		in.close();
	}
}