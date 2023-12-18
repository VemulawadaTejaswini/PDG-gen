import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        String S = sc.next();
        S=S+"Z";
        char[] c = S.toCharArray();
        
        long cnt=0;
        for(int i=0;i<N;i++) {
        	if(c[i]!=c[i+1]) {
        		cnt++;
        	}
        }
        cnt=cnt-2*K;
        if(cnt<1) {
        	cnt=1;
        }
        
        long ans=N-cnt;
        System.out.println(ans);        	
                		
    }
    
    
}