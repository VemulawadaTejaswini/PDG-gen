import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		Integer[] h = new Integer[n];
		for (int i = 0; i < n; i++) {
			h[i] = stdIn.nextInt();
		}
		int diff = 0;
		int diffmin = 0;
		
		Arrays.sort(h, Collections.reverseOrder());
		
		/*
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (h[i] < h[j]) {
					h[i] = h[i] + h[j];
					h[j] = h[i] - h[j];
					h[i] = h[i] - h[j];
				}
			}
		}
		*/
		
		diffmin = h[0] - h[0 + k - 1];
			
		for (int i = 0; i < n - k + 1; i++) {
		
			diff = h[i] - h[i + k - 1];
			
			if (diffmin > diff) {
				diffmin = diff;
			}
		}
		
		System.out.println(diffmin);
	
	}
	
}