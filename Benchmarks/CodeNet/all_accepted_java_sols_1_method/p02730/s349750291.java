import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		int N = S.length();
		String S1 = S.substring(0, N / 2);
		String S2 = S.substring(((N + 3) / 2) - 1 , N);
		System.out.println(S1.equals(S2) ? "Yes" : "No");

		stdIn.close();
	}
}