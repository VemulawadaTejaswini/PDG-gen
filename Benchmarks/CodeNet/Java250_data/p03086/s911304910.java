import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		char s[] = scan.next().toCharArray();
		int count = 0;
		int ans = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'A' || s[i] == 'C' || s[i] == 'G' || s[i] == 'T') {
				count++;
			} else {
				if (ans < count) {
					ans = count;
					count = 0;
				}
			}
		}


		if (ans < count) {
			ans = count;

		}
		System.out.println(ans);
	}

}