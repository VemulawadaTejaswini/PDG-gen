import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	long inf = (long)Math.pow(10, 18);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int Q = sc.nextInt();
    	
    	long[] s = new long[A+2];
    	s[0] = -inf;
    	for( int i = 1; i <= A; i++ ){
    		s[i] = sc.nextLong();
    	}
    	s[A+1] = inf;
    	
    	long[] t = new long[B+2];
    	t[0] = -inf;
    	for( int i = 1; i <= B; i++ ){
    		t[i] = sc.nextLong();
    	}
    	t[B+1] = inf;
    	
    	for( int i = 0; i < Q; i++ ){
    		long x = sc.nextLong();
    		
    		int[] sa = new int[2];
    		int[] ta = new int[2];
    		int temp = Arrays.binarySearch(s, x);
    		sa[1] = (temp + 1) * -1;
    		sa[0] = sa[1] - 1;
    		temp = Arrays.binarySearch(t, x);
    		ta[1] = (temp + 1) * -1;
    		ta[0] = ta[1] - 1;
    		
    		//System.out.println( sa[0] + " " + ta[0] );
    		long min = inf;
    		for( int j = 0; j < 2; j++ ){
    			for( int k = 0; k < 2; k++ ){
    				long c1 = Math.abs( x - s[sa[j]] ) + Math.abs( s[sa[j]] - t[ta[k]] );
    				long c2 = Math.abs( x - t[ta[k]] ) + Math.abs( s[sa[j]] - t[ta[k]] );
    				min = Math.min(min, Math.min(c1, c2));
    			}
    		}
    		System.out.println( min );
    	}
    	
    	sc.close();
    }
} 