import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int count = 0;

		for (int i = A; i < B+1; i++) {
			String s = String.valueOf(i);
			String[] array = new String[5];
			for (int j = 0; j < 5; j++) {
				array[j] = s.substring(j, j+1);
			}

			if (array[0].equals(array[4]) && array[1].equals(array[3])) {
				count++;
			}
		}
		System.out.println(count);
	}

}