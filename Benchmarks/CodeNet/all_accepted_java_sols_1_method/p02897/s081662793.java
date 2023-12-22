import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) System.out.println(1.0 / 2.0);
		else System.out.println((double) (n / 2 + 1) / (double) n);
	}
}
