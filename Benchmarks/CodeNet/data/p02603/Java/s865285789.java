import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = 1000;

		int[] ai = new int[n];
		for (int i = 0; i < n; i++) {
			ai[i] = sc.nextInt();
		}		
		for (int i = 0; i < n-1; i++) {
			if( ai[i] < ai[i+1] ) {
				int stock = ans / ai[i];
				ans += (ai[i+1] - ai[i]) * stock;  
			}
		}
		
		System.out.println(ans);
		
	}
}
