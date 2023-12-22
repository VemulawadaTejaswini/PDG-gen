    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int n=Integer.parseInt(scan.next());
    		int k=Integer.parseInt(scan.next());
    		
    		if(n%k>0) {
    			System.out.print(1);
    		}else {
    			System.out.print(0);
    		}
   
     
    }
    }
// end 