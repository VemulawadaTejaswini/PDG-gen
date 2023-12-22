import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		char a = s.toCharArray()[0];
		System.out.println((char) (a + 1));
	}
}
