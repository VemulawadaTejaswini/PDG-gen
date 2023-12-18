import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long k = sc.nextLong();
		System.out.println((a-b) * (k % 2 == 0 ? 1 : -1));
	}

}
