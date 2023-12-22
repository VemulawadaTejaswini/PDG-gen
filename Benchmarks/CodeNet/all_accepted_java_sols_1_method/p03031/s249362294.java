import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        
	        int[][] s=new int[M][N];
	        for(int i=0;i<M;i++) {
	        	int k = sc.nextInt();
	        	for(int j=0;j<k;j++) {
	        		s[i][sc.nextInt()-1]++;
	        	}
	        }
	        int[] p = new int[M];
	        for(int i=0;i<M;i++) {
	        	p[i]=sc.nextInt();
	        }
	        long ans=0;
	        for(int i=0;i<(1<<N);i++) {
		        int[] m= new int[M];
		        for(int j=0;j<N;j++) {
		        	if(((i>>j)&1)==1) {
			        	for(int k=0;k<M;k++) {
			        		if(s[k][j]==1) {
			        			m[k]++;
			        		}
		        		}		        	
			        }
	        	}
	        	boolean isOK=true;
	        	for(int j=0;j<M;j++) {
	        		if(m[j]%2!=p[j]) {
	        			isOK=false;
	        			break;
	        		}
	        	}
	        	if(isOK==true) {
	        		ans++;
	        	}
	        }
	        
	        System.out.println(ans);
  	        	        
	 }

}