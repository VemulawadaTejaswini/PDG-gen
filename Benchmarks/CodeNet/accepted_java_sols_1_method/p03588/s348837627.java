import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();
            
            if (a < ai) {
                a = ai;
                b = bi;
            }
        }
        
        System.out.println(a+b);
    }
}
