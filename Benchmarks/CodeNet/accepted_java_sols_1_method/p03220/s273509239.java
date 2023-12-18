
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t, n, a, h[];
		double h2[];
		
		n = sc.nextInt();
		t = sc.nextInt();
		a = sc.nextInt();
		
		h = new int[n];
		h2 = new double[n];
		
		for(int i = 0; i < n; ++i) {
			h[i] = sc.nextInt();
			h2[i] = (double)t - ((double)h[i] * 0.006);
			h2[i] = Math.abs((double)a-h2[i]);
		}
		
		int min = 0;
		for(int i = 0; i < n; ++i) {
			if(h2[min] > h2[i]) {
				min = i;
			}
		}
		
		System.out.println(min + 1);
		sc.close();
	}

}
