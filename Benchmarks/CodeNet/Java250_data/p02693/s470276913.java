import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int k = scnr.nextInt();
		int a = scnr.nextInt();
		int b = scnr.nextInt();

		int counter = 0;

		for (int i = a; i <= b; i++) {
			if(i % k == 0) {
				counter = counter + 1;
			}
		}

		if (counter == 0) {
			System.out.print("NG");
		}
		else if (counter > 0) {
			System.out.print("OK");
		}
	}
}