    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		
    		for (int i=1;i<1010;++i) {
    			if ((int)(i*0.08)==a && (int)(i*0.1)==b) {
    				System.out.print(i);
    				System.exit(0);
    				break;
    			}
    		}
    		System.out.print(-1);
    		
    		
    }	
    }
// end 