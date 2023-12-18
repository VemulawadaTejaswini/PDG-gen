import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] p = new int[N];
        double ans=0;
        
        long[] q = new long[N];
        for(int i=0;i<N;i++) {
        	p[i]=sc.nextInt();
        }
        long cnt=0;
        for(int i=0;i<K;i++) {
        	q[0]=q[0]+p[i];
        }
        for(int i=K;i<N;i++) {
        	q[i-K+1]=q[i-K]+p[i]-p[i-K];
        }
        long max=0;
        for(int i=0;i<N;i++) {
        	max=Math.max(max, q[i]);
        }
        ans=(max+K)/2.0;
        System.out.println(ans);        	
                		
    }
    
    
}