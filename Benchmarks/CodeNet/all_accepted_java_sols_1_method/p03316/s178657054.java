import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int s = 0;
		int n2 = n;
		while (n2 > 0) {
			s += n2 % 10;
			n2 /= 10;
		}
		if (n % s == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
