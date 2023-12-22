    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		char[] s=scan.next().toCharArray();
    		int ans =700;
    		for (char i:s) {
    			if (i=='o') {
    				ans+=100;
    			}
    		}
    		System.out.print(ans);


    		
     
    }
    }
// end 