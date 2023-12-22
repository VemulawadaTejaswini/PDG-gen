import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long sum = 0;
		if (N <= 2) {
			System.out.println(0);
		}
		else {
			for (int i = 1; i<Math.sqrt(N); i++) {
				if (N % i == 0) {
					if(N/i != i + 1) {
					sum += N/i -1;
					}
				}
			}
		
			System.out.println(sum);
		}
		
	}
}	
