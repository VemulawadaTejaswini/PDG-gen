    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		int c=Integer.parseInt(scan.next());
    		int d=Integer.parseInt(scan.next());
    				
    		if (a+b==c+d) {
    			System.out.print("Balanced");
    		}else if (a+b>c+d) {
    			System.out.print("Left");
    		}else {
    			System.out.print("Right");
    		}
     
    }
    }
// end 