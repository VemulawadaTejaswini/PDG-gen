import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();

		System.out.println(String.format("%.12f", Math.pow((double)L, 3.0) / 27.0));
	}
}