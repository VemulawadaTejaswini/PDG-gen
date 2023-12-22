    import java.util.Arrays;
import java.util.Scanner;
     
    public class Main {
    	public static void main (String[] args) {
    		Scanner sc = new Scanner(System.in);
    		
    		String S = sc.next();
    		String T = sc.next();
    		
    		String Ss[] = S.split("");
    		String Ts[] = T.split("");
    		
    		String tmpS[] = S.split("");
    		
    		for (int i = 0; i < S.length(); i++) { 
            
    			for (int j = 0; j < S.length(); j++) {
    				
    				if (j != S.length() - 1){
    					tmpS[j + 1] = Ss[j];
    				} else {
    					tmpS[0] = Ss[j];
    				}
    				
    				
    			}
    			
    			for (int j = 0; j < S.length(); j++) {
    				Ss[j] = tmpS[j];
    			}
    			
    			if (Arrays.equals(tmpS, Ts)) {
    				System.out.println("Yes");
    				return;
    			}

    		}
    		
    		System.out.println("No");
    		
    		
    	}
    }