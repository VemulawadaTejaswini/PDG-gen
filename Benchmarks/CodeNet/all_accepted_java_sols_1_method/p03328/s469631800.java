import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = 0;
        for(int i = 1; i < b - a; i++) {
            ans += i;
        }
        System.out.println( ans - a );
    }
}
