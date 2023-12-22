import java.util.*;
 
public class Main {
 
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    
      int n = scan.nextInt();
      int k = scan.nextInt();
      int yen[] = new int[n];
      
      for(int i=0; i<n; i++) yen[i] = scan.nextInt();
      
      Arrays.sort(yen);
      
      int sum = 0;
      
      for(int i=0; i<k; i++) sum += yen[i];
        
      System.out.println(sum);
      
      
    }
}