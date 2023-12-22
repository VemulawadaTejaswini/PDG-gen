import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		long fh = X / 500;
		long f = (X - fh * 500) / 5;

		System.out.println(fh * 1000 + f * 5);
	}
}
