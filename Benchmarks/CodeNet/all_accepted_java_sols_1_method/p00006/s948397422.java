import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		StringBuilder inputData = new StringBuilder(sc.next());

		System.out.println(inputData.reverse());
	}
}