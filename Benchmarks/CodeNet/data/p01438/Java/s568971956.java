import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int BEGIN = 6;
	public static final int END = 22;
	
	public static final int MAX = END - BEGIN;
	
	public static final int BIT_MAX = 1 << MAX;
	
	public static final int MAX_G = 100;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[] DP = new long[BIT_MAX];
		
		int[] bits = new int[MAX_G];
		long[] benefits = new long[MAX_G];
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			for(int i = 0; i < n; i++){
				final int m = sc.nextInt();
				final int l = sc.nextInt();
				benefits[i] = l;
				bits[i] = 0;
				
				for(int j = 0; j < m; j++){
					final int s = sc.nextInt() - BEGIN;
					final int e = sc.nextInt() - BEGIN - 1;
					
					for(int k = s; k <= e; k++){
						bits[i] |= 1 << k;
					}
				}
			}
			/*
			System.out.println(Arrays.toString(benefits));
			//*/
			
			Arrays.fill(DP, -1);
			DP[0] = 0;
			long max = 0;
			for(int guy = 0; guy < n; guy++){
				final long guy_ben = benefits[guy];
				final int  guy_bit = bits[guy];
				
				for(int bit = BIT_MAX - 1; bit >= 0; bit--){
					if(DP[bit] < 0){
						continue;
					}else if((bit & guy_bit) != 0){
						continue;
					}
					
					DP[bit | guy_bit] = Math.max(DP[bit | guy_bit], DP[bit] + guy_ben);
					max = Math.max(max, DP[bit | guy_bit]);
				}
			}
			/*
			for(int i = 0; i < MAX; i++){
				System.out.println((i + BEGIN) + " : " + Arrays.toString(DP[i]));
			}
			*/
			
			System.out.println(max);
		}
		
	}

}