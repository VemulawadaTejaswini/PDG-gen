import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t[] = new int[n];
		
		for (int i = 0; i <= n - 1; i++) {
			t[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int p[] = new int[m];
		int x[] = new int[m];
		
		for (int i = 0; i <= m - 1; i++) {
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		
		int sum = 0;
		int y = 0;
		
		for (int i = 0; i <= m - 1; i++) {
			y = t[p[i] - 1];
			t[p[i] - 1] = x[i];
			for (int j = 0; j < t.length; j++) {
				sum += t[j];
			}
			System.out.println(sum);
			sum = 0;
			t[p[i] - 1] = y;
		}
	}
}