	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        long A = sc.nextLong();
	        long B = sc.nextLong();
	        long ans=0;
	        long a1=(B+1)/2-A/2;
	        if(a1%2!=0) {
	        	if(a1>=0)ans++;
	        }
	        long tmp=2;
	        for(long i=1;i<40;i++) {
	        	tmp=2*tmp;
	        	long a = A%tmp;
	        	long b = B%tmp;
	        	if(a<=tmp/2) {
	        		a=0;
	        	} else {
	        		a=tmp-a;
	        	}
	        	if(b<tmp/2) {
	        		b=0;
	        	} else {
	        		b=b-tmp/2+1;
	        	}
	        	if((a+b)%2!=0) {
	        		ans=ans+tmp/2;
	        	}
	        }
	        
	        
	        System.out.println(ans);
	        

	    }
	    
	    

	}