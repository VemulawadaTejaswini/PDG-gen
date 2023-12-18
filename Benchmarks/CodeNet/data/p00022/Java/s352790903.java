import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			Long[] a = new Long[n];
			for (int i = 0; i < n; i++) {
				a[i] = stdIn.nextLong();
			}
			long max = 0;
			for (int i = 0; i < n; i++) {
				long sum = 0;
				for (int j = i; j < n; j++) {
					sum += a[j];
					if (sum > max) {
						max = sum;
					}
				}
			}
			System.out.println(max);
		}
	}

}