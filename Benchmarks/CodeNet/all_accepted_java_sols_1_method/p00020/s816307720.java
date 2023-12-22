import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String inputData = sc.nextLine();

		System.out.println(inputData.toUpperCase());
	}

}