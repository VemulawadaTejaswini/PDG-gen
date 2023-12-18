import java.util.Scanner;


import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] d = new int[n];
		for(int i = 0; i<n ;i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		if(n%2 == 1) {
			System.out.println(0);
		}
		else {
			int half = n/2;
			System.out.println(d[half] - d[half-1] );
		}
	}
}
