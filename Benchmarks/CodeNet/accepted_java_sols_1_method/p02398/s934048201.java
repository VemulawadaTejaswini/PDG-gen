import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] array = line.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);

		int result = 0;
		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				result++;

			}

		}
		System.out.println(result);

	}

}