    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan=new Scanner(System.in);
    		
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		
    		if(a%3==0||b%3==0||(a+b)%3==0) {
    			System.out.print("Possible");
    		}else {
    			System.out.print("Impossible");
    		}

    		
    	
  
    				
 
     
    }
    }