import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && m == 0) break;
			int[] hS = new int[n+1];
			int[] wS = new int[m+1];
			for(int i = 1; i < n+1; i++) {
				hS[i] = hS[i-1] + stdIn.nextInt();
			}
			for(int i = 1; i < m+1; i++) {
				wS[i] = wS[i-1] + stdIn.nextInt();
			}
			int count = 0;
			for(int i = 0; i < n+1; i++) {
				for(int j = i + 1; j < n+1; j++) {
					for(int k = 0; k < m+1; k++) {
						for(int l = k + 1; l < m+1; l++) {
							if(hS[j] - hS[i] == wS[l] - wS[k]) {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}