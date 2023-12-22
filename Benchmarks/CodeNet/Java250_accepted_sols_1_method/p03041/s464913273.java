import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		sc.close();

		System.out.println(
			S.substring(0, K-1) +
			(char)(S.charAt(K-1) - 'A' + 'a') +
			S.substring(K)
		);
	}

}
