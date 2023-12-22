import java.util.Scanner;

public class Main{

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str1 = sc.next();
	        String str2 = sc.next();
	        
	        if(str2.length() == str1.length()+1) {
	        String sub = str2.substring(0,str1.length());
	        if(sub.equals(str1)) {
	        	System.out.println("Yes"); 
	        }
	        else {
	        	System.out.println("No"); 
	        }
	        }
            
            

          
	        
            //System.out.println(res); 
	        
	}
}