    import java.util.Scanner;
     
    public class Main {
    	public static void main (String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String S = sc.next();
    		
    		if (S.charAt(0) != 'A') {
    			System.out.println("WA");
    			return;
    		}
    		
    		int countC = 0;
    		
    		for (int i = 2; i < S.length() - 1; i++) {
    			
    			if (S.charAt(i) == 'C') {
    				countC++;
    				
    			}
    		}
    		
    		if (countC != 1) {
    			System.out.println("WA");
    			return;
    		}
    		
    		for (int i = 1; i < S.length(); i++) {
    			
    			if( Character.isUpperCase(S.charAt( i )) && S.charAt( i ) != 'C')  {
    				System.out.println("WA");
        			return;
    			}
    		}
    		
    		System.out.println("AC");
    		
    	}
    }