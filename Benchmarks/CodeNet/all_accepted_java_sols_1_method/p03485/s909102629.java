import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = ((a + b + 1) / 2);
        
        System.out.println(ans);
        
        sc.close();
        
    }
}
