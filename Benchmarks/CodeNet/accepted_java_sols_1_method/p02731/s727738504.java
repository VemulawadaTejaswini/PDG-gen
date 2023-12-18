import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double l = sc.nextInt();
		sc.close();

		double l3 = l / 3;
		System.out.println(l3 * l3 * l3);
	}
}
