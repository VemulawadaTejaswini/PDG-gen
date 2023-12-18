import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int ans = (int)Math.ceil((double)(N-1) / (K-1));
        
        System.out.println(ans);
    }
}
