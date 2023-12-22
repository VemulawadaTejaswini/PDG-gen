import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int numN = scan.nextInt();
		String str = scan.next();

		char[] array = str.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] +numN > 'Z') {
				array[i] = (char) ( array[i] +numN - 26);
			} else {
				array[i] = (char) ( array[i] +numN);
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}