import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 2  - 1;
	
	public static final int MAX = 5000000;
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int[] count   = new int[MAX + 1];
		int[] a_count = new int[MAX + 1];
		int[] b_count = new int[MAX + 1];
		
		while (true) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int d = sc.nextInt();
			
			if(a == 0 && b == 0 && d == 0){
				break;
			}
			
			Arrays.fill(count  , INF);
			Arrays.fill(a_count, INF);
			Arrays.fill(b_count, INF);
			count[0]   = 0;
			a_count[0] = 0;
			b_count[0] = 0;
			
			for(int i = 0; i <= MAX - a; i++){
				if(count[i] < INF){
					if(count[i + a] > count[i] + 1){
						count[i + a]   = count[i] + 1;
						a_count[i + a] = a_count[i] + 1;
						b_count[i + a] = b_count[i];
					}
				}
			}
			
			for(int i = 0; i <= MAX - b; i++){
				if(count[i] < INF){
					if(count[i + b] > count[i] + 1){
						count[i + b]   = count[i] + 1;
						a_count[i + b] = a_count[i];
						b_count[i + b] = b_count[i] + 1;
					}
				}
			}
			
			int min = INF;
			int min_i = Integer.MAX_VALUE;
			for(int i = d; i <= MAX; i++){
				if(min > (count[i - d] + count[i])){
					min_i = i;
					min = (count[i - d] + count[i]);
				}
			}
			
			int a_num = a_count[min_i - d] + a_count[min_i];
			int b_num = b_count[min_i - d] + b_count[min_i];
			
			System.out.println(a_num + " " + b_num);
		}
	}

}