import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char s[] = new char[101];
		s = scan.next().toCharArray();

		for(int i = 0; i < s.length; i++) {
			if(i % 2 == 0) {
				// 偶数文字目がRでない
				if(s[i] == 'L') {
					System.out.println("No");
					return;
				}
			}else {
				// 奇数文字目がLでない
				if(s[i] == 'R') {
					System.out.println("No");
					return;
				}
			}
		}

		System.out.println("Yes");

	}
}