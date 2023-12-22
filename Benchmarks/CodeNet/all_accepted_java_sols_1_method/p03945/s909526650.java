import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] != c[i+1]) count++;
        }
        System.out.println(count);
    }
}
