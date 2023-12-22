import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String step;
		String answer = "Yes";
		int len;

		// 文字列を読み込む
		step = scan.next();
		len = step.length();

		for(int i = 0; i < len; i++) {
			if((i % 2 == 0 && step.charAt(i) == 'L') || (i % 2 == 1 && step.charAt(i) == 'R')) {
				answer = "No";
				break;
			}
		}

		System.out.println(answer);

	}
}
