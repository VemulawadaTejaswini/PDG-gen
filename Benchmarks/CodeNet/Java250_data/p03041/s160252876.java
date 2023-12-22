import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		String S = scan.next();
		char[] list = new char[N] ;

		for (int i = 0; i < N; i++) {
			list[i] = S.charAt(i) ;

			if (i == K - 1) {
				if (list[i] == 'A') {
					list[i] = 'a' ;
				}
				else if (list[i] == 'B') {
					list[i] = 'b' ;
				}
				else if (list[i] == 'C') {
					list[i] = 'c' ;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(list[i]);
		}
	}
}