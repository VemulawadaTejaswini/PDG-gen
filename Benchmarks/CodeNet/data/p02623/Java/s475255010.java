import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
	    Deque<Integer> aq = new ArrayDeque<>();
	    Deque<Integer> bq = new ArrayDeque<>();
		
		int[] a = new int[n];
		for( int i=0 ; i<n ; i++ ) {
			a[i] = sc.nextInt();
			aq.add(a[i]);
		}
		int[] b = new int[m];
		for( int i=0 ; i<m ; i++ ) {
			b[i] = sc.nextInt();
			bq.add(b[i]);
		}
		
		long s=0;
		int c=0;
		
		while( true ) {
			
			Integer pa = aq.peekFirst();
			Integer pb = bq.peekFirst();
			
			if ( pa == null ) pa = Integer.MAX_VALUE; 
			if ( pb == null ) pb = Integer.MAX_VALUE; 
			if( pa < pb ) {
				aq.pollFirst();
				s += pa;
			}else {
				bq.pollFirst();
				s += pb;
			}
			
			if( s > k ) break;
			c++;
		}
		System.out.println(c);
		
	}

}