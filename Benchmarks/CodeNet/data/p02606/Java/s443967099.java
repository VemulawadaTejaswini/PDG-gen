import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(n2 / d - (n - 1) / d);

	}
}


