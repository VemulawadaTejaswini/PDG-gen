import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        String T1 = S.substring(0,N/2);
        String T2 = S.substring(N/2);

        if(T1.equals(T2)) {
            System.out.println("Yes");        	
        } else {
            System.out.println("No");        	        	
        }
                		
    }
}