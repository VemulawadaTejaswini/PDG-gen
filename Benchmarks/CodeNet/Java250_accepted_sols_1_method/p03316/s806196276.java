import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N, SN;
		N = Integer.parseInt(S);
		SN = 0;
		int N2 = N;
		for (int i = 0; i < S.length(); i++) {
			SN += N2 % 10;
			N2 /= 10;
		}
		System.out.println(N % SN == 0 ? "Yes" : "No");
	}
}