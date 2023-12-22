import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scannerS = new Scanner(System.in);
		String S = scannerS.next();
		String T = scannerS.next();
		int A = scannerS.nextInt();
		int B = scannerS.nextInt();
		String U = scannerS.next();

		int a = A;
		int b = B;

		if (S.equals(U)) {
			a = a - 1;
		} else if (T.equals(U)) {
			b = b - 1;
		}

		System.out.println(a + " " + b);
	}

}