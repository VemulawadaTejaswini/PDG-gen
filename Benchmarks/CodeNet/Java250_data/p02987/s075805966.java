import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        
        boolean ok = false;
        if (c[0] == c[1] && c[2] == c[3] && c[0] != c[2]) {
            ok = true;
        } else if (c[0] == c[2] && c[1] == c[3] && c[0] != c[1]) {
            ok = true;
        } else if (c[0] == c[3] && c[1] == c[2] && c[0] != c[1]) {
            ok = true;
        }
        
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}