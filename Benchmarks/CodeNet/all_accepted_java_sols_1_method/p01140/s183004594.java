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
			int hmax = 0;
			int wmax = 0;
			for(int i = 1; i < n+1; i++) {
				hS[i] = hS[i-1] + stdIn.nextInt();
				if(hS[i] > hmax) {
					hmax = hS[i];
				}
			}
			for(int i = 1; i < m+1; i++) {
				wS[i] = wS[i-1] + stdIn.nextInt();
				if(wS[i] > wmax) {
					wmax = wS[i];
				}
			}
			int count = 0;
			int[] listhS = new int[hmax+1];
			int[] listwS = new int[wmax+1];
			int max = Math.min(hmax, wmax);
			for(int i = 0; i < n+1; i++) {
				for(int j = i + 1; j < n+1; j++) {
					listhS[hS[j] - hS[i]]++;
				}
			}
			for(int k = 0; k < m+1; k++) {
				for(int l = k + 1; l < m+1; l++) {
					listwS[wS[l] - wS[k]]++;
				}
			}
			for(int i = 0; i < max+1; i++) {
				count += listhS[i] * listwS[i];
			}
			System.out.println(count);
		}
	}
}