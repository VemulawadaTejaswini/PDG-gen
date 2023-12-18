import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = Long.parseLong((sc.next()));
		long w = Long.parseLong((sc.next()));
		long cell = h * w;

		if (h == 1 || w == 1) {
			System.out.println(1);
		} else if (cell % 2 == 1) {
			System.out.println(cell / 2 + 1);
		} else {
			System.out.println(cell / 2);
		}

	}
}
