import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] h = new int[N];
		int hmin = 1000;
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		int total = h[0];
		if (N == 1) {
			System.out.println(total);
		}
		else if (N==2) {
			total = Math.max(h[0], h[1]);
			System.out.println(total);
		}
		else {
			for (int i = 1; i < N; i++) {
				if(h[i] > h[i-1]) {
					total += h[i] - h[i-1];
				}
			}
			System.out.println(total);
		}
	}
}	
