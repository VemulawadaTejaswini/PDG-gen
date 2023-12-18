import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//?????°?¨????
		Scanner sc = new Scanner(System.in);
	    String line = sc.nextLine();
		while(line != null) {
			String[] numbers = line.split(" ");

			Integer ans = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
			System.out.println(String.valueOf(ans).length());

			line = sc.nextLine();
		}

	}

}