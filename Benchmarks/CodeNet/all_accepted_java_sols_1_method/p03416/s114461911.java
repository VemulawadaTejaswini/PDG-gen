
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int ans = 0;
        for (int i = A; i <= B; i++) {
        	String s = String.valueOf(i);
        	if (s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)) {
        		ans++;
        	}
        }
        
        
        System.out.println(ans);
    }
}


