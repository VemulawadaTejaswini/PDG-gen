import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		String H = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String U = sc.next();


		if(U.equals(S)) {
			A--;
		}else if(U.equals(H)) {
			B--;
		}
		System.out.println(A);
		System.out.println(B);
	}
}
