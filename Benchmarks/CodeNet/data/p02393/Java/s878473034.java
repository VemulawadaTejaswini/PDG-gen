import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] list = new int[3];

		for (int i = 0; i < list.length; i++)
			list[i] = scanner.nextInt();

		Arrays.sort(list);
		System.out.println(list[0] + " " + list[1] + " " + list[2]);
	}
}