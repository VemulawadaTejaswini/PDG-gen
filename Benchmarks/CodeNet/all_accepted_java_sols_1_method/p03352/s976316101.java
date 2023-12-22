
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		long max = 1;
		for (int i = 1; i <= Math.sqrt(X); i++) {
			for (int j = 2; j <= Math.sqrt(X); j++) {
				long let = (long)Math.pow(i, j);
				if (let <= X && let > max) {
					max = let;
				}
			}
		}
		System.out.println(max);
		}

}
