import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//文字列SのかかれたボールA個
		//文字列TのかかれたボールB個
		String S = sc.next();
		String T = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();

		//文字列Uのかかれたボール
		String U = sc.next();

		//すてた文字列を判定
		if (U.contains(S)) {

			A = A - 1;

		} else if (U.contains(T)) {

			B = B - 1;
		}

		System.out.println(A + " " + B);
	}

}
