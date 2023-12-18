import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] iArray = new int[n];
		int result = 0;
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			iArray[i] = m;
			x = x - m;
			result++;
		}
		if (x > 0) {
			Arrays.sort(iArray);
			int min = iArray[0];
			int cnt = x / min;
			result = result + cnt;
		}
		System.out.println(result);
	}
}