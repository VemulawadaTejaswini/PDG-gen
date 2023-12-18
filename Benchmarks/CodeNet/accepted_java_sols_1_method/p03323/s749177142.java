import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		if(n > 8 || m > 8) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}

	}

}
