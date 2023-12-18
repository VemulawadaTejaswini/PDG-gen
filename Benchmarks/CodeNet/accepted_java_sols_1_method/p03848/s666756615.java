import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] cnt =new int[N];
	        int cnt0=0;
	        if(N%2==0)cnt0++;
	        long[] a = new long[N];
	        for (int i=0 ; i<N-1; i++) {
	            a[i] = Long.parseLong(sc.next());
	            if(a[i]==0) {
	            	cnt0++;
	            	if(cnt0>1) {
	            		System.out.println(0);
	            		return;
	            	}
	            } else if(a[i]==N%2){
	            	System.out.println(0);
	            	return;
	            } else {
	            	cnt[(int) (a[i]/2)]++;
	            	if(cnt[(int) (a[i]/2)]>2){
		            	System.out.println(0);
		            	return;	            		
	            	}
	            }
	        }
	        long ans=1;
	        for(int i=0;i<N/2;i++) {
	        	ans=(ans*2)%mod;
	        }
	        System.out.println(ans);
	 }
	 

}
