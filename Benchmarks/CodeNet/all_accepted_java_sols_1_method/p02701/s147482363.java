import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();	
        String[] a = new String[N];
        for (int i=0 ; i<N; i++) {
            a[i] = sc.next();
        }
        Arrays.sort(a);
        int ans=1;
        for(int i=0;i<N-1;i++) {
        	if(!a[i].equals(a[i+1]))ans++;
        }
    	
    	
    	System.out.println(ans);
    	
        		
    }
}