import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();

		long a = N-2;
		long b = M-2;

		System.out.println(Math.abs(a*b));
	}

}
