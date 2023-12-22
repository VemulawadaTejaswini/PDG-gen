import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		String a = S.substring(K - 1);
		String b = a.toLowerCase();
		char c = b.charAt(0);
		String d = S.substring(K);
		String e = S.substring(0, K - 1);
		System.out.println(e + c + d);

	}

}