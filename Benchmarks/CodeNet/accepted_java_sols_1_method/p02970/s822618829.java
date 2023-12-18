import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		System.out.println((int) Math.ceil(N / (D * 2D + 1)));
	}

}
