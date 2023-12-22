import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		double value = Math.log(N) / Math.log(K);

		System.out.println((int) Math.floor(value) + 1);

		sc.close();
	}

}
