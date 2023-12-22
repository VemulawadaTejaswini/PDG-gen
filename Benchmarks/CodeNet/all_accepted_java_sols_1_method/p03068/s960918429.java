import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int N = sc.nextInt();
		String s = sc.next();
		int K = sc.nextInt();
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)!=s.charAt(K-1)) {
				System.out.print("*");
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
