import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char c[] = str.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (c[i] != c[n-1-i]) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 1 - 1; i < (n - 1) / 2; i++) {
            if (c[i] != c[(n-1)/2 - 1 - i]) {
                System.out.println("No");
                return;
            }
        }
        int j = n - 1;
        for (int i = (n + 3) / 2 - 1; i < n; i++) {
            if (c[i] != c[j--]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
