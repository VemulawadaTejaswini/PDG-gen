import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long l0 = 2; long l1 = 1;
		long li = 0;
		for(int i = 2; i <= n; i++) {
			li = l0+l1;
			l0 = l1; l1 = li;
		}
		System.out.println(n == 1 ? 1 : li);
		sc.close();
	}
}