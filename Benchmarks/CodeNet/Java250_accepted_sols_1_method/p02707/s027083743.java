import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[0] = 0;
		}

		for(int i=0; i < n - 1; i++) {
			array[sc.nextInt() - 1] += 1;
		}

		for(int i = 0; i < n ; i++) {
			System.out.println(array[i]);
		}

		sc.close();

	}

}