import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        String str2 = sc.next();
        char c2[] = str2.toCharArray();
        
        int n = c.length;
        int offset = 0;
        while (offset <= n) {
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (c[i] != c2[(i+offset) % n]) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) {
                System.out.println("Yes");
                return;
            }
            offset++;
        }
        
        
        System.out.println("No");
    }
}