import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		long sum = a[n - 1];
		int countVal = n - 2, curInd = n - 2;
		while (countVal > 0) {
			sum += a[curInd];
			--countVal;
			if (countVal > 0) {
				sum += a[curInd];
				--countVal;
				curInd--;
			}
		}
		System.out.println(sum);
	}
}
