import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		int len1 = S.length();
		int len2 = S.replace("ABC", "").length();
		System.out.println((len1-len2)/3);
	}
}