import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n + 1];
		for(int i = 1; i <= n; i++) t[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m + 1];
		int[] x = new int[m + 1];
		int time;
		for(int i = 1; i <= m; i++) {
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		for(int i = 1; i <= m; i++) {
			time = 0;
			for(int j = 1; j <= n; j++) {
				if(j == p[i]) time += x[i];
				else time += t[j];
			}
			System.out.println(time);
		}
	}
}