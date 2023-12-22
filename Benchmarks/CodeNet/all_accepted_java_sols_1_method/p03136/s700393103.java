//package abc117_B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			sum += l;
			max = Math.max(max, l);
		}
		
		System.out.println((max < sum - max) ? "Yes" : "No");
	}

}