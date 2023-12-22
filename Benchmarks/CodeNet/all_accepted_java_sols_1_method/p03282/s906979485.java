import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        long k = sc.nextLong();
        int n = str.length();
        
        for (int i = 0; i < k; i++) {
            if (c[i] == '1') {
                if (i == k - 1) {
                    System.out.println(1);
                    return;
                }
            } else {
                System.out.println(c[i]);
                return;
            }
        }
    }
}
