import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			if (a == 0 && b == 0) break;
			if (a < b) System.out.println(a + " " + b);
			else System.out.println(b + " " + a);
		}
		sc.close();
	}
}