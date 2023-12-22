import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        long k = sc.nextLong();
        
        int onelast = -1;
        char next = 'a';
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '1') {
                next = c[i];
                break;
            }
            onelast = i;
        }
        onelast++;
        
        if (k <= onelast) {
            System.out.println(1);
        } else {
            System.out.println(next);
        }
    }
}
