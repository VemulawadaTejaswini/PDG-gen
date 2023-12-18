import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		// code to read values
		// code to call required method
		// code to display the result
		// System.out.println(Math.ceil(2.5));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long sum = sum(arr);
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			// System.out.println("hey");
			int old = sc.nextInt();
			int recent = sc.nextInt();
			// System.out.println("hey");
			for (int j = 0; j < n; j++) {
				if (arr[j] == old) {
					arr[j] = recent;
					sum = sum - old + recent;
				}
			}
			System.out.println(sum);
		}
	}

	public static long sum(int[] arr) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
}