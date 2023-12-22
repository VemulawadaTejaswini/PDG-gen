import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char c = S.toCharArray()[0];
		System.out.print((char) (c + 1));
	}
}