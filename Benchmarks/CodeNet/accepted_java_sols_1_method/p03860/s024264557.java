import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String s = sc.next();
		String c = sc.next();
		System.out.println(a.substring(0, 1) + s.substring(0, 1) + c.substring(0, 1));
		sc.close();
	}
}