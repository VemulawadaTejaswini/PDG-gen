import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		int ans = INF;
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] W = new int[N];
		for(int i=0; i<N; i++){
			W[i] = Integer.parseInt(sc.next());
		}
		
		//Arrays.sort(W);
		
		for(int T=1; T<N; T++){
			int left = 0;
			int right = 0;
			for(int i=0; i<N; i++){
				if(i<=T){
					left += W[i];
				}else{
					right += W[i];
				}
			}
			int tmp = Math.abs(right-left);
			ans = Math.min(ans, tmp);
		}
		
		
		
		System.out.println(ans);
		
	}
	
	
}

