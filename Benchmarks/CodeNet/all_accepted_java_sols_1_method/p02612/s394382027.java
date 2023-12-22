import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n % 1000 == 0 ? 1000 : n % 1000;
		System.out.println(1000 - t);

	}
}


