import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
        int nam[] = new int[n];
        int count = 0;
      
      for(int i = 0 ;i < n ;i++){
       nam[i] =  in.nextInt();
      }
      
      for(int i = 1;i < n-1;i++){
        if(nam[i-1]>nam[i]&&nam[i]>nam[i+1]){count++;}
        else if(nam[i-1]<nam[i]&&nam[i]<nam[i+1]){count++;}
      }
      
      System.out.print(count);
      
	}
}