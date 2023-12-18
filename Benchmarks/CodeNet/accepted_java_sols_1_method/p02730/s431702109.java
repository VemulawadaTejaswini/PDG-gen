import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        
        int a = 1 -1;
        int b = c.length -1;
        while (a <= b) {
            if (c[a] != c[b]) {
                System.out.println("No");
                return;
            }
            a++;
            b--;
        }
        
        a = 1 -1;
        b = ((c.length - 1)/2) -1;
        while (a <= b) {
            if (c[a] != c[b]) {
                System.out.println("No");
                return;
            }
            a++;
            b--;
        }
        
        a = ((c.length+3)/2) -1;
        b = c.length -1;
        while (a <= b) {
            if (c[a] != c[b]) {
                System.out.println("No");
                return;
            }
            a++;
            b--;
        }
        System.out.println("Yes");
    }
}
