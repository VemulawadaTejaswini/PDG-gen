
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
		long ans = Integer.MAX_VALUE;
		for (int i = a[0]; i <= a[n - 1]; i++) {
			long sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum += Math.pow((i - a[j]), 2);
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}


