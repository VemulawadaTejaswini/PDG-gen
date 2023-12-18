import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();

		String StrOut = S.substring(0, K);
		StrOut += "...";
		System.out.println(StrOut);
	}
}
