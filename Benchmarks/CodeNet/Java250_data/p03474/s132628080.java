import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        String S = sc.next();
        
        for (int i = 0; i < A; i++) {
        	if (S.charAt(i) == '-') {
        		System.out.println("No");
        		return;
        	}
        }
        
        if (S.charAt(A) != '-') {
    		System.out.println("No");
    		return;
        }
        
        for (int i = A+1; i < B+A+1; i++) {
        	if (S.charAt(i) == '-') {
        		System.out.println("No");
        		return;
        	}
        }
        
        System.out.println("Yes");
    }
    
}