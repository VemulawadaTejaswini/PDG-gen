import java.util.Arrays;
import java.util.Scanner;


class Main {
	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		int[] kekka = new int[10];
		for (int i = 0; i < 10; i++) {
			kekka[i] = scanner.nextInt();
		}
		Arrays.sort(kekka);
		System.out.println(kekka[9]);
		System.out.println(kekka[8]);
		System.out.println(kekka[7]);
	}
}