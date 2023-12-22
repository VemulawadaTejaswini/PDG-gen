import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];

			for (int i = 0; i < 5; i++) {
				array[i] = scan.nextInt();
			}

			java.util.Arrays.sort(array);

			System.out.println(array[4] +" "+ array[3] +" "+array[2] +" "+array[1] +" "+array[0]);

	}
}