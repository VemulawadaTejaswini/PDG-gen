import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
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
		
		int[] a = new int[n+1];
		long[] as = new long[n+1];
		for( int i=0 ; i<n ; i++ ) {
			a[i] = sc.nextInt();
			as[i+1] = as[i] + a[i];
		}
		int[] b = new int[m+1];
		long[] bs = new long[m+1];
		for( int i=0 ; i<m ; i++ ) {
			b[i] = sc.nextInt();
			bs[i+1] = bs[i] + b[i];
		}
		
		int c=0;
		
		int j=m;
		for( int i=0 ; i<n+1 ; i++ ) {
			if( as[i] > k) {
				break;
			}
			while( bs[j] > k - as[i] ) {
				j--;
			}
			c = Math.max(c, i+j);
		}
		
		System.out.println(c);
//		for( int in =0 ; in < n+1 ; in++ )
			System.err.println(Arrays.toString(as));
			System.err.println(Arrays.toString(bs));
		
	}
