import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int inputNum = sc.nextInt();

		if (inputNum != 0) {
			for (int i = inputNum; i > 1; i--) {
				inputNum *= (i - 1);
			}
			System.out.println(inputNum);
		} else {
			System.out.println(1);
		}
	}

}