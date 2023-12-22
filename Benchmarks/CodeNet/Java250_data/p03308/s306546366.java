import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = scan.nextInt();
		}
		
		Arrays.sort(input);
		System.out.println(input[n - 1] - input[0]);
		scan.close();
	}
}
