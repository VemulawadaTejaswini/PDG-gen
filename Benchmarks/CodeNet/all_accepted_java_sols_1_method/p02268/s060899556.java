import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] S = new int[n];
			for(int i=0; i<n; i++) {
				S[i] = sc.nextInt();
			}
			
			int q = sc.nextInt();
			int[] T = new int[q];
			for(int i=0; i<q; i++) {
				T[i] = sc.nextInt();
			}
			Arrays.sort(T);
			
			int ans = 0;
			for(int i=0, j=0; i<n && j<q; i++) {
				if(S[i] == T[j]) {
					ans++;
					j++;
				}
				else if(S[i] > T[j]) {
					i--;
					j++;
				}
			}
			System.out.println(ans);
		}
	}	
}

