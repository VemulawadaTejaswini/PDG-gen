import java.util.Scanner;

public class Main {

	static final long MOD = 1000000007;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int W = scan.nextInt();

		System.out.println(W >= S ? "unsafe" : "safe");

	}
}