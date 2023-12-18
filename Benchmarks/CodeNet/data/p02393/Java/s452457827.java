import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		Integer[] array = new Integer[3];
		for (int i = 0; i < 3; i++) {
			array[i] = new Integer(scan.nextInt());
		}
		Arrays.sort(array);
		System.out.printf("%d %d %d\n", array[0], array[1], array[2]);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}