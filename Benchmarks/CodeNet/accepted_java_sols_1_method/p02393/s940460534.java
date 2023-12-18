import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];

		for (int i = 0; i < 3; i++) {
			ar[i] = sc.nextInt();
		}

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 2; i++) {
				if (ar[i] > ar[i + 1]) {
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
			}
		}

		System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);

	}
}

