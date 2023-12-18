import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//?????°?¨????
		Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		String[] numbers = sc.nextLine().split(" ");

		Integer ans = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);

		System.out.println(String.valueOf(ans).length());

	}

}