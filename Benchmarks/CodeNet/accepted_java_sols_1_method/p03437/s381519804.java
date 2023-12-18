import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long y = sc.nextInt();
		if (x % y != 0)
			System.out.println(x);
		else
			System.out.println("-1");
	}
}
