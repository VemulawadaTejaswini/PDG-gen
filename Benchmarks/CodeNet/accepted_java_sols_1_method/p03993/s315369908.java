import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if (arr[i] != i) {
				if (arr[arr[i]] == i) {
					sum++;
				}
			}
		}
		
		System.out.println(sum / 2);
	}
}