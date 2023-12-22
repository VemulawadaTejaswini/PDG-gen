import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String T = scanner.next();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		String U = scanner.next();

//		System.out.println(S);

//		System.out.println(U.equals(S)?A-1:B-1);
		if (U.equals(S)) {
			System.out.println(A-1);
			System.out.println(B);
		} else if (U.equals(T)){
			System.out.println(A);
			System.out.println(B-1);
		}

	}

}