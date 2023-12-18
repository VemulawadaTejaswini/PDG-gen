import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N=sc.nextInt();
	        ArrayList<Long> a = new ArrayList<>();
	        for (int i=0 ; i<N; i++) {
	            a.add(sc.nextLong());
	        }
	        long[] m= new long[N];
	        for(int i=0;i<N;i++) {
	        	for(int j=a.size()-1;j>=0;j--) {
	        		if(a.get(j)==j+1) {
	        			m[i]=a.get(j);
	        			a.remove(j);
	        			break;
	        		}
	        		if(j==0) {
	        			System.out.println(-1);
	        			return;
	        		}
	        	}
	        }
	        for(int i=N-1;i>=0;i--) {
	        	System.out.println(m[i]);
	        }
	        
	 }

}