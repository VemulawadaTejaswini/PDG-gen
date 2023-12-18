import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[10];
		for(int i = 0; i < 10; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(A);
		for(int i = 9; i >= 7; i--) {
			System.out.println(A[i]);
		}

	}

}

