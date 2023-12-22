import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		String C = scan.next();
		if(A.substring(A.length() - 1, A.length()).equals(B.substring(0, 1)) && B.substring(B.length() - 1, B.length()).equals(C.substring(0, 1))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();

	}

}
