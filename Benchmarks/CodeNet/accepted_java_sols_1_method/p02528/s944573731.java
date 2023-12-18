import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = stdIn.nextInt();
		}
		Arrays.sort(ar);
		System.out.print(ar[0]);
		for(int i = 1; i < n; i++) {
			System.out.print(" " + ar[i]);
		}
		System.out.println();
	}

}