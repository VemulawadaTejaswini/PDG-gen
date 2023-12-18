package cp;

import java.util.*;


public class Main{
	static int MOD=(int) (1e9+7);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
  int k=sc.nextInt();
   ArrayList<Long> al=new ArrayList<>();
    for(int i=0;i<n;i++){
		al.add(sc.nextLong());
      
    }
    ArrayList<Long> b=new ArrayList<>(al);



    Collections.sort(al);
   

    long ans=1; long ncount=0;
    if (al.get(n-1) == 0 && (k & 1)!=0) { 
    	System.out.println(0);
    }
        
    if(k==n) {
    for(int i=0;i<n;i++) {
    	ans=mul(ans,al.get(i));
    }
    System.out.println(ans);
    
    }else {
    	 if (al.get(n-1) <= 0 && k % 2 != 0) { 
             for (int i = n - 1; i >= n - k; i--) 
               ans =mul(ans,al.get(i)); 
        	 System.out.println(MOD+ans);
         }else {
    
    
    	int i=0;int j=n-1;
    	if(k%2!=0) {
    		ans=mul(ans,al.get(j));
    		j--;
    		k--;
    	}
    	k=k>>1;
    	for( int itr =0;itr<k;itr++) {
    		long lf=mul(al.get(i),al.get(i+1));
    		long rf=mul(al.get(j),al.get(j-1));
    		if(lf>rf) {
    			ans=mul(ans,lf);
    			i=i+2;
    		}else {
    			ans=mul(ans,rf);
    			j=j-2;
    		}
    	}
    	System.out.println(ans%MOD);
    }
    }
    
	}
	 private static long mul(long a, long b) {
		    return (((a + MOD) % MOD) * ((b + MOD) % MOD)) % MOD;
		  }
	}
	


  
   