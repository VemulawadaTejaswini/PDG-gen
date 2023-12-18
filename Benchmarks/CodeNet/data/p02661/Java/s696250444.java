
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int minArr[] = new int[n], maxArr[] = new int[n];
		int i = 0;
		while (++i <= n) {
			minArr[i - 1] = sc.nextInt();
			maxArr[i - 1] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(minArr);
		Arrays.sort(maxArr);
		if (n % 2 == 0) {
			int minVal = (minArr[n / 2] + minArr[(n / 2) - 1]) / 2;
			int maxVal = (int) Math.ceil((0.0 + maxArr[n / 2] + maxArr[(n / 2) - 1]) / 2);
//			System.out.println(maxVal + " " + minVal);
			System.out.println(maxVal - minVal + 1);
		} else {
			System.out.println(maxArr[n / 2] - minArr[n / 2] + 1);
		}
	}
}
