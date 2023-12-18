import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String N = sc.next();
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        int[] m = new int[c.length];
	        int[] mr = new int[c.length];
	        int[] mb = new int[c.length];
	        int[] mg = new int[c.length];
	        for(int i=0;i<c.length;i++) {
	        	if(i!=0) {
	           		mr[i]=mr[i-1];
	           		mb[i]=mb[i-1];
	           		mg[i]=mg[i-1];
	        	}
 	        	if(c[i]=='R') {
	        		m[i]=0;
	           		mr[i]++;
	        	} else if(c[i]=='B') {
	        		m[i]=1;
	           		mb[i]++;
	        	} else {
	        		m[i]=2;
	           		mg[i]++;
	        	}
	        }
	        
	        
	        
	        long ans=0;
	        for(int i=0;i<c.length-2;i++) {
	        	int[] kk=new int[3];
	        	kk[m[i]]++;
	        	for(int j=i;j<c.length-1;j++) {
	        		if(kk[m[j]]==1)continue;
	        		kk[m[j]]++;
	        		if(kk[0]==0) {
	        			ans=ans+mr[c.length-1]-mr[j];
	        			if(2*j-i<c.length&&c[2*j-i]=='R')ans--;
	        		}else if(kk[1]==0) {
	        			ans=ans+mb[c.length-1]-mb[j];
	        			if(2*j-i<c.length&&c[2*j-i]=='B')ans--;	        			
	        		} else {
	        			ans=ans+mg[c.length-1]-mg[j];
	        			if(2*j-i<c.length&&c[2*j-i]=='G')ans--;
	        		}
	        		kk[m[j]]--;
	        	}
	        }
	        
	        
	    	System.out.println(ans);
	        
	        	        	        
	 }
}