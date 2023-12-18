
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] length = new int[n];
		for (int i = 0; i < length.length; i++) {
			length[i] = scan.nextInt();
		}
		
		Arrays.sort(length);
		int sum = 0;
		for (int i = 0; i < length.length - 1; i++) {
			sum += length[i];
		}
		
		if (sum > length[length.length - 1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scan.close();
	}
}