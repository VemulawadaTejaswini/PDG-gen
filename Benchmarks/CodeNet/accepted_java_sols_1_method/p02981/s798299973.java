import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = n * a;

        if (ans >= b) {
            ans = b;
        }

        System.out.println(ans);

        sc.close();
    }    
}
