import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == 'A' && c[i+1] == 'C') {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}