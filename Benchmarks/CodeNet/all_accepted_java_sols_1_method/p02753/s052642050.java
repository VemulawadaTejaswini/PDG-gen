import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean A=S.equals("BBB");
		boolean B=S.equals("AAA");
		System.out.println(A||B?"No":"Yes");
	}
}


