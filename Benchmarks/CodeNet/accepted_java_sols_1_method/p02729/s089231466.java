import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int M = 0;
		N = sc.nextInt();
		M = sc.nextInt();
		int ans = 0;
		ans = N * (N - 1) / 2 + M * (M - 1) / 2;
		System.out.println(ans);
		sc.close();
	}

}