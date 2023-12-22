// code by Juan Torres
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		int[] k = new int[n+1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				int a = Math.abs(j-i);
				int b = Math.abs(x-i) + 1 + Math.abs(y-j);
				int c = Math.abs(y-i) + 1 + Math.abs(x-j);
				
				int min = Math.min(Math.min(a, b),c);
				k[min]++;
			}
		}
		for(int i = 1; i < n; i++) {
			System.out.println(k[i]/2);
		}
	}
}
