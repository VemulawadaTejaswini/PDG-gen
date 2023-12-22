import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String S = sc.next();
		String ABC = null;
		int count = 0;

		for (int i = 0; i < A - 2; i++) {
			ABC = S.substring(i, i + 3);
			if (ABC.equals("ABC")) {
				count++;
			}

		}
		System.out.print(count);
		sc.close();
	}

}
