import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {

			final int n = sc.nextInt();
			final int w = sc.nextInt();
			
			if(n == 0 && w == 0){
				break;
			}
			
			int[] h_count = new int[20];
			int v_max = 0;
			int h_max = 0;
			
			for(int i = 0; i < n; i++){
				final int v = sc.nextInt();
				h_count[v/w]++;
				v_max = Math.max(v_max, v);
				h_max = Math.max(h_max, h_count[v/w]);
			}
			
			int m = v_max / w + 1;
			double ans = 0;
			for(int i = 0; i < m; i++){
				double a = (double) (m - i - 1) / (m - 1);
				double b = (double) h_count[i] / h_max;
				ans += a * b;
			}
			ans += 0.01;
			
			System.out.println(ans);
		}
	}

}