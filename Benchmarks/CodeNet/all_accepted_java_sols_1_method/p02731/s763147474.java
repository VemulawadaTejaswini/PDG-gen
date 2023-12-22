import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        double l;
        double n,m;
        
        l = sc.nextInt();
        
        n = l / 3;
        
        m = l - n - n;
        
        System.out.println(n * n * m);
    }
}
