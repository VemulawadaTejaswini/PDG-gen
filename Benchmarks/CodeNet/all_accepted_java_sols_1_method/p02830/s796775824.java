import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		String T = in.next();
		for (int i = 0; i < N; i++) {
			System.out.print(S.charAt(i));
			System.out.print(T.charAt(i));
		}
		System.out.println();
		in.close();
	}
}