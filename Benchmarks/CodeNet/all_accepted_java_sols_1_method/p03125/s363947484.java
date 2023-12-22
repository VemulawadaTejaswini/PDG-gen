import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();

		if (b % a == 0) {
			System.out.print(a+b);
		} else {
			System.out.print(b-a);
		}
	}


}