    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		char[] s=scan.next().toCharArray();
    		
    		for (int i=0;i<10;++i) {
    			if (i==3) {
    				System.out.print(8);
    			}else {
    				System.out.print(s[i]);
    			}
    		}
     
    }
    }
// end 