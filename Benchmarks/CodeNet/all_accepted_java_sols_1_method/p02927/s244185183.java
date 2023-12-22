import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        if (d < 22) {
            System.out.println(0);
            return;
        }
        if (m < 4) {
            System.out.println(0);
            return;
        }
        
        int count = 0;
        for (int i = 22; i <= d; i++) {
            int a = i / 10;
            int b = i - a * 10;
            
            if (b < 2) continue;
            
            if (a * b <= m) {
                count++;
            }
        }
        
        
        System.out.println(count);
    }
}
