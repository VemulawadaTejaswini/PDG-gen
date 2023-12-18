import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		if (a <= b || a <= (b * 2)) {
			System.out.println("0");
		} else {
			System.out.println(a - (b * 2));
		}
		sc.close();
	}
}