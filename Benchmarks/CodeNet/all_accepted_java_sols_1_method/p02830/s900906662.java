import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		String answer = "";

		for (int i = 0; i < N; i++) {
			answer += String.valueOf(S.charAt(i)) + String.valueOf(T.charAt(i));
		}

		System.out.println(answer);
	}
}