import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();


		int cnt = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length() - i; j++) {
				if (s.charAt(i + j) == 'A' || s.charAt(i + j) == 'T' || s.charAt(i + j) == 'G' || s.charAt(i + j) == 'C') {
					cnt++;
				} else {
					break;
				}
			}
			if (max < cnt) {
				max = cnt;
			}
			cnt = 0;
		}

		System.out.println(max);
	}

}