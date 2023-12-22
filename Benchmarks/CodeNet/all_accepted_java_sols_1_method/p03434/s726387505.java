
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] point = new Integer[n];
		for (int i = 0; i < n; i++) {
			point[i] = scan.nextInt();
		}
		
		Arrays.sort(point, Collections.reverseOrder());
		
		int sum = 0;
		for (int i = 0; i + 1 < point.length; i += 2) {
			sum += point[i] - point[i + 1];
		}
		if (point.length % 2 == 1) {
			sum+= point[point.length - 1];
		}
		
		System.out.println(sum);
	}
}
