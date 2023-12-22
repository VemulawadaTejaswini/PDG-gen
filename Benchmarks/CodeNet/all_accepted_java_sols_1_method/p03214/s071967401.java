import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int[] a = new int[n];
			int sum = 0;
			int[] dist = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				sum += a[i];
			}
			for (int i = 0; i < n; i++) {
				dist[i] = Math.abs(sum-a[i] * n);
			}
			int min = 0;
			for (int i = 0; i < n; i++) {
				if(dist[min] > dist[i]){
					min = i;
				}
			}
			System.out.println(min);

		    sc.close(); }
}
