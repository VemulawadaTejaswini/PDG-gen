import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        int N = sc.nextInt();
        int[] a = new int[N];
        long sum=0;
        for(int i=0;i<N;i++) {
        	a[i]=sc.nextInt();
        	sum=sum+a[i];
        }
        if(H<=sum) {
    	    System.out.println("Yes");
        } else {
    	    System.out.println("No");
        }
        
		
    }
}