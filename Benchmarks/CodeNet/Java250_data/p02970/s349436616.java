import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int D = sc.nextInt();
		
		final int div = N / (2 * D + 1);
		final int mod = N % (2 * D + 1);
		
		if (mod == 0) {
			System.out.println(div);
		} else {
			System.out.println(div + 1);
		}
	}

}