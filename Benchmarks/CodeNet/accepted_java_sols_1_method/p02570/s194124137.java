import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();

		sc.close();

		if ((double) D / T <= S) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

	}

}
