import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] ar = new int[n];
			int[] abs = new int[n-k+1];
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			Arrays.sort(ar);
			for (int i = 0; i < n-k+1; i++) {
				abs[i] = ar[k-1+i] - ar[i];
			}
			int min = abs[0];
			for (int i = 0; i < n-k+1; i++) {
				if (abs[i] < min) {
					min = abs[i];
				}
			}
			System.out.println(min);
			sc.close();
		}
}