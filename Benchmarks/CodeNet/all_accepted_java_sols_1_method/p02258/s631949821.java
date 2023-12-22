import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		int max = arr[n - 1];
		int diff_max = Integer.MIN_VALUE;
		for(int i = n - 2; i >= 0; i--){
			diff_max = Math.max(diff_max, max - arr[i]);
			
			max = Math.max(max, arr[i]);
		}
		
		
		System.out.println(diff_max);
		
	}
}