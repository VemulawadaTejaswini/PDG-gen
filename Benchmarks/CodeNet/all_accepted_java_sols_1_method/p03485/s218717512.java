import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int output;

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();


		if(	(a+b)%2 == 0)
			output = (a+b)/2;
		else output = (a+b)/2 + 1;

		System.out.println(output);

	}

}
