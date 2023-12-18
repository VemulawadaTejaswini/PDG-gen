import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int even = 0;
		int odd = 0;

		even = N * (N - 1) / 2;
		odd = M * (M - 1) / 2;

		System.out.println(even + odd);
	}
}