import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int N, i;
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		i = sc.nextInt();
		System.out.println(N - i + 1);

		sc.close();
	}
}
