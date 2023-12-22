import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String[] str = new String[5];
		int len = 0;
		int answerSum = 0;

		for (int i = 1; i <= N; i++) {
			len = String.valueOf(i).length();
			str = String.valueOf(i).split("");
			int digitSum = 0;
			for (int j = 0; j < len; j++) {
				digitSum += Integer.valueOf(str[j]);
			}
			if (A <= digitSum && digitSum <= B) answerSum += i;
		}

		System.out.println(answerSum);
	}
}
