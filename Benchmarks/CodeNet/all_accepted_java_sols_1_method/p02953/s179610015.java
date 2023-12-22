import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        boolean ok = true;
        
        for (int i = 0; i < n - 1; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            } else if (max - num >= 2) {
                ok = false;
                break;
            }
        }
        
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
