import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long sum=0;
        for(int i=1;i<H+100;i++) {
        	if(H<(long)Math.pow(2, i)) {
        	   sum = (long)Math.pow(2,i)-1;
        	   break;
        	}
        }
        
        System.out.println(sum);
        		
    }
}