	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextInt();
	        if(N==0) {
	        	System.out.println(0);
	        	return;
	        }
        	int cnt=0;
        	char[] c = new char[10000];
	        while(N!=0) {
	        	if(N%2==1||N%2==-1) {
        			c[cnt]='1';
	        		if(cnt%2==0) {
	        			N=N-1;
	        		} else {
	        			N=N+1;
	        		}
	        	} else {
	        		c[cnt]='0';
	        	}
        		N=N/2;
        		cnt++;
	        }
	        
	        StringBuffer ans = new StringBuffer();
	        for(int i=cnt-1;i>=0;i--) {
	        	ans.append(c[i]);
	        }
	        
	        System.out.println(ans);
	    }
	}