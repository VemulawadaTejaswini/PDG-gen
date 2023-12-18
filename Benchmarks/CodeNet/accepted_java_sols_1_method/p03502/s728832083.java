import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();

		int n9 = n / 100000000;
		int n8 = n / 10000000;
		int n7 = n % 10000000 / 1000000;
		int n6 = n % 1000000 / 100000;
		int n5 = n % 100000 / 10000;
		int n4 = n % 10000 / 1000;
		int n3 = n % 1000 / 100;
		int n2 = n % 100 / 10;
		int n1 = n % 10;
		int f = n9 + n8 + n7 + n6 + n5 + n4 + n3 + n2 + n1;

		System.out.println(n % f == 0 ? "Yes" : "No");
	}
}