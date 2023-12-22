import java.util.*;

public class Main {
	
	   

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int[] all = new int[n];
	        for(int i = 0 ; i<n; i++) {
	        	all[i] = sc.nextInt();
	        }
	        Arrays.sort(all);
	        int sum = 0;
	        for(int j=0; j<k; j++) {
	        	sum += all[j];
	        }
	        
	        
	        
	        
	       
            System.out.println(sum); 
	        
	}
}