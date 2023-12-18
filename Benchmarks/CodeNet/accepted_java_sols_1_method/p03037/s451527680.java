import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] L = new int [M];
		int [] R = new int [M];	
		int min = 0;
		int max = 100000;
		for (int i = 0; i<M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			min = Math.max(min, L[i]);
			max = Math.min(max, R[i]);
		}
		if(min<=max) {
			System.out.println(max-min+1);
		}
		else {
			System.out.println(0);
		}
	}
}	

