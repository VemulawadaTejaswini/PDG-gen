
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		System.out.println(Math.sqrt(Integer.parseInt(a + b)) % 1 == 0 ? "Yes" : "No");
	}
}