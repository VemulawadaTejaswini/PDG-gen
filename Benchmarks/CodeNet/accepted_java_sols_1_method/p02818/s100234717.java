import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        long ans;
        if(A<K) {
        	B=B-K+A;
        	if(B<0) {
        		B=0;
        	}
        	A=0;
        } else {
        	A=A-K;
        }
        
        System.out.println(A+" "+B);
        		
    }
}