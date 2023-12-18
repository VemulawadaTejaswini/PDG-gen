import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int[] mountHill = new int[10];

		for (int i = 0; i < 10; i++) {
			mountHill[i] = sc.nextInt();

			if (mountHill[i] > 10000 || mountHill[i] < 0) {
				System.out.println("error");
			}
		}
		Arrays.sort(mountHill);

		System.out.println(mountHill[9] + "\n" + mountHill[8] + "\n"
				+ mountHill[7]);
	}

}