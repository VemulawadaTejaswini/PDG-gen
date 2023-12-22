import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		System.out.println((long) (N + Math.pow(N, 2) + Math.pow(N, 3)));
	}
}