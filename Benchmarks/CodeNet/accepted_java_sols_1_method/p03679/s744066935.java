    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan=new Scanner(System.in);
    		
    		int x=Integer.parseInt(scan.next());
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());

    		if(a-b>=0) {
    			System.out.print("delicious");
    		}else if (b-a<=x) {
    			System.out.print("safe");
    		}else {
    			System.out.print("dangerous");
    		}
    		
    	
  
    				
 
     
    }
    }