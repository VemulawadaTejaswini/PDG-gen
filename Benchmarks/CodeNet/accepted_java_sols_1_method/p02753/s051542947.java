import java.util.*;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
 	String str  = sc.next();
  
  	char[] c_arr = str.toCharArray();
    
    sc.close();
  	
    if (c_arr[0] == 'A' && c_arr[1] == 'A' && c_arr[2] == 'A') {
         System.out.print("No"); 
    } else if (c_arr[0] == 'B' && c_arr[1] == 'B' && c_arr[2] == 'B') {
         System.out.print("No"); 
    } else {
         System.out.print("Yes"); 
    }
    
	
	}
}