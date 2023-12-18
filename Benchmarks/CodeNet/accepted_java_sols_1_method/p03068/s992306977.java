import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int strLen = Integer.parseInt(sc.next());
    		char[] S = sc.next().toCharArray();
    		int K = Integer.parseInt(sc.next());
    		
    		char targChar = S[K - 1];
    		
    		for (int i = 0; i < strLen; i++) {
    			if (S[i] != targChar) {
    				S[i] = '*';
    			}
    			System.out.print(S[i]);
    		}
    		System.out.println();
    		
    		
    	} catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
    
}