import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int min = n+1;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] < min) {
				min = p[i];
				ans++;
			}			
		}

		System.out.println(ans);
	}
}