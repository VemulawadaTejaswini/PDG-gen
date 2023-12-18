import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i< N/R + 1; i++) {
			Inner:
			for (int j = 0; j < N/G + 1; j++) {
				if (N - (R * i + G * j) < 0) {
					break Inner;
				}
				else if ((N - (R * i + G * j)) % B == 0) {
					cnt++;
				}
			}

		}
		
		
		System.out.println(cnt);
	}
}	
