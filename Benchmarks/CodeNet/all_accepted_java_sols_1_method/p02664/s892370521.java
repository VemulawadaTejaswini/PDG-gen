import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        
        int n = c.length;
        for (int i = 0; i < n-1; i++) {
            if (c[i] == 'P' && c[i+1] == '?') {
                c[i+1] = 'D';
            }
        }
        for (int i = 0; i < n-1; i++) {
            if (c[i] == '?' && c[i+1] == 'D') {
                c[i] = 'P';
            }
        }
        for (int i = 0; i < n-1; i++) {
            if (c[i] == '?' && c[i+1] == '?') {
                c[i] = 'P';
                c[i+1] = 'D';
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (c[i] == '?') c[i] = 'D';
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}
