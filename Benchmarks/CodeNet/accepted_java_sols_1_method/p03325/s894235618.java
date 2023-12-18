import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int counter = 0;
		for (int i = 0; i < length; i++) {
			int number = sc.nextInt();
			while (number % 2 == 0) {
				number= number/2;
				counter += 1;
			}
		}
		System.out.println(counter);
	}

}