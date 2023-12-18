    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		int x=Integer.parseInt(scan.next());
    		
    		if (a==x||(a+b>=x&&a<=x)) {
    			System.out.print("YES");
    		}else {
    			System.out.print("NO");
    		}
    		


    		
     
    }
    }
// end 