import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String S = scan.next();

 		// c[i]がアルファベットの何番目か
		for(int i = 0; i < S.length(); i++) {
				
				System.out.print((char)((S.charAt(i) - 'A' + N)%26 + 'A'));
		}

	}
}
