import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        
        long cnt=0;
        for(int i=0;i<N;i++) {
        	A[i]=sc.nextLong();
        }
        Arrays.sort(A);
        String ans="YES";
        for(int i=0;i<N-1;i++) {
        	if(A[i]==A[i+1]) {
        		ans="NO";;
        		break;
        	}
        }

        System.out.println(ans);        	
                		
    }
    
    
}