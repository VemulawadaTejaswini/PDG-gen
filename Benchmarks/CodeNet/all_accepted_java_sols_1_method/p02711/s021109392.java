import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();

		String B = String.valueOf(A);

		char[] C = B.toCharArray();

		if (C[0] == '7' || C[1] == '7' || C[2] == '7') {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

	return;

	}
}
