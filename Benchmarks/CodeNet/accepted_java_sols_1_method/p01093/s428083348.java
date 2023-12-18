import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			int[] score = new int[n];
			for(int i = 0; i < n; i++) score[i] = sc.nextInt();
			Arrays.sort(score);
			
			int min = 1000000;
			for(int i = 0; i < n - 1; i++) {
				int diff = score[i+1] - score[i];
				if(diff < min) min = diff;
			}
			System.out.println(min);
		}
	}

}

