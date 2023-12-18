import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		int[] iarray = new int[10];
		for (int i = 0; i < iarray.length; i++) {
			Scanner scanner = new Scanner(System.in);
			iarray[i] = scanner.nextInt();
			System.out.println(iarray[i]);
		}
		Arrays.sort(iarray);
		for (int i = 1; i <= 3; i++) {
			System.out.println(iarray[10 - i]);
		}

	}

}