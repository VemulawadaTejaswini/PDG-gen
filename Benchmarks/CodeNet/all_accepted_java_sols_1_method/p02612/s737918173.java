import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		if (A % 1000 == 0) {
			System.out.println(0);
		} else {
			System.out.println(1000 - (A % 1000));

		}
	}
}