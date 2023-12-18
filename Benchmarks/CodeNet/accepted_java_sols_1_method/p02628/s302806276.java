import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] arr = new int[t];
		int type = scan.nextInt();
		for (int count = 0; count < t; count++)
			arr[count] = scan.nextInt();
		Arrays.sort(arr); int sum = 0;
		for (int count = 0; count < type; count++)
			sum += arr[count];
		System.out.println(sum);
		scan.close();
	}
}
