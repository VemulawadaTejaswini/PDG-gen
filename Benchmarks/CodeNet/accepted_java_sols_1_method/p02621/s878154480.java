import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        
        long ans = a + a*a + a*a*a;
        
        System.out.println(ans);
        
        
    }
}
