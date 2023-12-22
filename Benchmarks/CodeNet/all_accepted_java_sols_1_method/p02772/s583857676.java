import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
       int arr[] = new int[n]; 
       
       for(int i = 0; i<n; i++) {
    	   arr[i] = sc.nextInt();
    	   if(arr[i] % 2 == 0 && arr[i] % 3 != 0 && arr[i] % 5 != 0) {
    		   System.out.println("DENIED"); 
    		   return ; 
    	   }
       }
      System.out.println("APPROVED");        
	}
}