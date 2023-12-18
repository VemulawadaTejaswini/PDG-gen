import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[3];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int min = 1000000000;
		int max = -1000000000;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max=ar[i];
			}
			if (ar[i] < min) {
				min=ar[i];
			}

		}
		System.out.println(min+" "+max);

	}
}

