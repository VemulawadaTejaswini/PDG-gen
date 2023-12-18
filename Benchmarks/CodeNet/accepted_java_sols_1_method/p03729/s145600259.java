import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		sc.close();
		char c1 = A.charAt(A.length() - 1);
		char c2 = B.charAt(0);
		char c3 = B.charAt(B.length() - 1);
		char c4 = C.charAt(0);
		if(c1 == c2 && c3 == c4) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}