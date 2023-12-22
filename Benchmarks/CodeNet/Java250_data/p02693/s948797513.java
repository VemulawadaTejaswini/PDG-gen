import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer K = Integer.parseInt(scanner.next());
		Integer A = Integer.parseInt(scanner.next());
		Integer B = Integer.parseInt(scanner.next());

		int a = A / K;
		int num = A % K;
		if (num == 0) {
			if (a * K <= B) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		} else {
			if ((a+1) * K <= B) {
				System.out.println("OK");;
			} else {
				System.out.println("NG");
			}
		}
	}

}
