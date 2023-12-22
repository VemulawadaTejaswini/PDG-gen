import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c1 = str.toCharArray();
        str = sc.next();
        char[] c2 = str.toCharArray();
        int n = c1.length;
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (c1[i] != c2[i]) count++;
        }
        System.out.println(count);
        
    }
}