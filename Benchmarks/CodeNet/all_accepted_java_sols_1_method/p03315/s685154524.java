    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		char[]s =scan.next().toCharArray();
    		
    		int ans=0;
    		for (char i:s) {
    			if (i=='-') {
    				--ans;
    			}else {
    				++ans;
    			}
    		}
    		
    		System.out.print(ans);

    		
     
    }
    }
// end 