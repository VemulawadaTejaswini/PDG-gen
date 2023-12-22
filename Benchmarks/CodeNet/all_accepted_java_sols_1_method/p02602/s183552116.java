import java.util.Scanner;
import java.io.*;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		/*long sum = 1;
		for(int i = 0; i < k; i++) {
			sum*= (long)a[i];
		}
		long pre = sum;
		
		for(int i = k; i < n; i++) {
			sum = sum * (long)a[i] / (long)a[i - k];
			//System.out.println(sum + " " + pre);
			if(sum > pre) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			pre = sum;
		}*/
		for(int i = k; i < n; i++) {
			if(a[i] > a[i - k]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
	
}
