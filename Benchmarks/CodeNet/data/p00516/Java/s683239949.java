import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[] p = new int[n];
		int[] b = new int[m];
		int[] t = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		for(int i = 0; i < m; i++) {
			b[i] = stdIn.nextInt();
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(p[j] <= b[i]) {
					t[j]++;
					break;
				}
			}
		}
		int ans = 0;
		int max = 0;
		for(int i = 0; i < n; i++) {
			if(t[i] > max) {
				max = t[i];
				ans = i;
			}
		}
		System.out.println(ans+1);
	}

}