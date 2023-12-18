import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] tarray = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			tarray[i] = i+1;
		}

		for (int i = 0; i < n; i++) {
			if (array[i] != tarray[i]) {
				count += 1;
			}
		}

		String message = (count == 0 || count == 2) ? "YES" : "NO";
		System.out.println(message);

	}

}
