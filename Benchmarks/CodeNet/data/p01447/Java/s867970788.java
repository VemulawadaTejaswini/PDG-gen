import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(parse(n));
		sc.close();
	}

	private static int parse(int n) {
		return (int) Math.ceil(Math.log10(n - 1) / Math.log10(3));
	}
}