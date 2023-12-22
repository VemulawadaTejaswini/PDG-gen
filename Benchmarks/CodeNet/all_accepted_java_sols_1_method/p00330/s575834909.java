import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		long num = sc.nextInt();

		System.out.println(num * 32);
	}

}