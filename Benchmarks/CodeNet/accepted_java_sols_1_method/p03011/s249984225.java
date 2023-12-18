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
		//int INF = Integer.MAX_VALUE;
		int ans;
		Scanner sc = new Scanner(System.in);
		int P = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		if(P<=Q){
			if(Q<=R){
				ans = P+Q;
			}else{
				ans = P+R;
			}
		}else{
			if(P<=R){
				ans = Q + P;
			}else{
				ans = Q+R;
			}
			
		}
		
		System.out.println(ans);
		
	}
	
	
}

