import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextLong();
		long T = sc.nextLong();
		sc.close();

		long temp = (N / X);
		temp = N % X == 0 ? temp : temp + 1;
		System.out.println(temp * T);

	}

}
