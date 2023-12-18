import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        String T = sc.next();
        
        for (int i = 0; i < 3; i++) {
        	if (S.charAt(i) != T.charAt(2-i)) {
        		System.out.println("NO");
        		return;
        	}
        }
        
        System.out.println("YES");
    }
}