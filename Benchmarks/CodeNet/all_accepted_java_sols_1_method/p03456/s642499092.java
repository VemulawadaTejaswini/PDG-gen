import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int joined = Integer.parseInt(a + b);
		if (Math.floor(Math.sqrt(joined)) - Math.sqrt(joined) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
