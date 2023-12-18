import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt(); 
			total += arr[i];	
		}
		int m = sc.nextInt();
		while (m-- > 0) {
			int p = sc.nextInt(); int x = sc.nextInt();
			int temp = total - arr[p-1] + x;
			System.out.println(temp);
		}
	}
}
