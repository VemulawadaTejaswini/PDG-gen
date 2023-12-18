import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (num != i) {
                count++;
            }
        }
        
        if (count == 2 || count == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
