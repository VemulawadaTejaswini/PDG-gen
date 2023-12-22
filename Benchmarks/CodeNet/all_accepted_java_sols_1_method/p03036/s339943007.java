import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		long x = Long.parseLong(sc.next());
		for (int i = 0; i < 10; i++) {
			x = r * x - d;
			System.out.println(x);
		}

	}

}
