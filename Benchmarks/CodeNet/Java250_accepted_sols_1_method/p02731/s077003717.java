import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		sc.close();
		System.out.println(String.format("%.16f", (double)(L*L*L) / 27));
	}
}