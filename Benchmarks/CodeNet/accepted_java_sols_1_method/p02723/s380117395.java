import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		boolean ok1 = S[2] == S[3];
		boolean ok2 = S[4] == S[5];
		System.out.println(ok1 && ok2 ? "Yes" : "No");
	}
}
