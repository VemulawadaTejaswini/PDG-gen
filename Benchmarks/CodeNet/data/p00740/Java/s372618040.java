package _1159;

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int p = sc.nextInt();

			if ((n | p) == 0) {
				break;
			}

			int[] x = new int[n];

			int ended = n ;
			int center = p;

			int i = 0;
			for (;; i++) {
				if (i == n) {
					i = 0;
				}

				if (center != 0) {
					center--;
					if (x[i] == 0) {
						ended--;
					}
					x[i]++;
				} else {
					if (x[i] != 0) {
						ended++;
					}
					center += x[i];
					x[i] = 0;
				}
				
				if(center == 0 && ended == n-1){
					System.out.println(i);
					break;
				}

			}
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}