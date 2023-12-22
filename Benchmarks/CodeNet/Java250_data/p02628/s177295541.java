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
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		//System.out.println(arr[0]);
		
		Arrays.sort(arr);
		//System.out.println(arr[0]);
		int sum = 0;
		for(int i=0; i<k; i++){
			sum += arr[i];
			//System.out.println(arr[0]);
		}
		System.out.println(sum);
	}
}