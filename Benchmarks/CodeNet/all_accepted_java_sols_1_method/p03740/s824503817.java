import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();

		System.out.println(Math.abs(x - y) > 1 ? "Alice" : "Brown");
	}
}
