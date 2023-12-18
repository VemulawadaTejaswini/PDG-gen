import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 1; i < 10000000; i++) {
            int c = (int)(Math.floor(i * 0.08));
            int d = (int)(Math.floor(i * 0.1));
            
            if (a == c && b == d) {
                System.out.println(i);
                return;
            }
        }
        
        System.out.println(-1);
    }
}
