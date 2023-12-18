import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 100000000;
	public static final int[] count = new int[MAX];
	
	public static void dps(int deep, int n, int cur, int m, int k){
		if(deep == n){
			count[Math.max(1, cur - k)-1]++;
		}else{
			for(int i = 1; i <= m; i++){
				dps(deep + 1, n, cur + i, m, k);
			}
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int k = sc.nextInt();
			
			if(n == 0 && m == 0 && k == 0){
				break;
			}
			
			Arrays.fill(count, 0);
			
			dps(0, n, 0, m, k);
			
			double sum = 0;
			double pow = Math.pow(m, n);
			for(int i = 0; i < (n * m - k); i++){
				if(count[i] != 0){
					//System.out.print((i + 1) + " " + count[i] + " : ");
					sum += (double) (i + 1) * count[i] / (pow);
				}
			}
			
			System.out.println(sum);
		}
	}

}