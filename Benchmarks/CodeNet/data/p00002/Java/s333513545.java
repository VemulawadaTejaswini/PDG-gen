import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()){

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			int total = num1 + num2;
			String str = Integer.toString(total);

			System.out.println(str.length());

		}
	}
}