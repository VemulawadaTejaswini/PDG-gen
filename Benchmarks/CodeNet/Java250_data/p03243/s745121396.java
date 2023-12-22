import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int td = N.toCharArray()[0] - '0';
		if (td * 111 < Integer.parseInt(N)) {
			System.out.println((td + 1) * 111);
		} else {
			System.out.println(td * 111);
		}

		sc.close();

	}
}