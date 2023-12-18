import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double ans = 0;

        ans = Math.pow(r, 2) * 3;

        System.out.println((int)ans);

        sc.close();
    }    
}
