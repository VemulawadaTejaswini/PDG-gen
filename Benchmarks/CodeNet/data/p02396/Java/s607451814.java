import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 10000;
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			Scanner scan = new Scanner(System.in);
			array[i] = scan.nextInt();
			if (array[i] == 0) {
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
			System.out.println("Case " + (i+1) + ": " + array[i]);
			}
		}
	}

}