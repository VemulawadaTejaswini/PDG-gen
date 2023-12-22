import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long n2 = 2;
		long n1 = 1;
		long lucas = 1;
		for (int i = 2; i <= n; i++) {
			lucas = n2 + n1;
			n2 = n1;
			n1 = lucas;
		}
		System.out.println(lucas);
	}
}
