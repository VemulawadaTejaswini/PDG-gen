import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		long sum = 0;
		for(int i = 1; i < n; i++) {
			sum += a[n-i/2-1];
		}
		System.out.println(sum);
	}
}
