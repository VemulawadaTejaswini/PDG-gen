import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        if (n % 2 != 0) {
            System.out.println("No");
            return;
        }
        
        char c[] = str.toCharArray();
        
        for (int i = 0; i < n / 2; i++) {
            if (c[i] != c[i + n / 2]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
