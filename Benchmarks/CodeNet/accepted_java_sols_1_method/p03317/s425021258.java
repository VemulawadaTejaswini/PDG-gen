import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int K = reader.nextInt();
		int ans = 0;
		while (N > 1) {
			N -= K - 1;
			ans++;
		}

		reader.close();
		System.out.print(ans);
	}
}

