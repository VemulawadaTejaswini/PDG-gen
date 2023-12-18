    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan=new Scanner(System.in);
    		
    		String upper =scan.next();
    		String lower =scan.next();

    		
    		if (upper.charAt(0)==lower.charAt(2)&&upper.charAt(2)==lower.charAt(0)&&upper.charAt(1)==lower.charAt(1)) {
    			System.out.print("YES");
    		}else {
    			System.out.print("NO");
    		}
    		
    	
  
    				
 
     
    }
    }
// end 