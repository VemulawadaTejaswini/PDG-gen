
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int ans = Integer.MAX_VALUE;
		for (int i = a[0]; i <= a[a.length - 1]; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum += Math.pow((a[j] - i), 2);
			}
			ans = Math.min(ans, sum);
		}
		
		System.out.println(ans);
	}
}
