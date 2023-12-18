import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String outStrings;

		if((a*b)%2 == 0)
			outStrings = "Even";
		else outStrings = "Odd";

		System.out.println(outStrings);

	}

}
