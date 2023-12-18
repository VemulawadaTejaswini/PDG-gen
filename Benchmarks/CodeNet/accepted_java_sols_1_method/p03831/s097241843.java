import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long A = sc.nextInt();	
	        long B = sc.nextInt();	
	        long[] a = new long[N];
	        long[] d = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }
	        long ans=0;
	        for(int i=0;i<N-1;i++) {
	        	d[i]=a[i+1]-a[i];
	        	ans=ans+Math.min(d[i]*A, B);
	        }
	        
	        System.out.println(ans);
	        
	 }

}