import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if ((a.equals(b) && a.equals("H")) || (a.equals("D") && b.equals("D")))
			System.out.println("H");
		else
			System.out.println("D");
		sc.close();
	}
}