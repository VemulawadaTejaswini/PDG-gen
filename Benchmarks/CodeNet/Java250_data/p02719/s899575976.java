import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long K = sc.nextLong();
        
        System.out.println(Math.min(N % K, K - (N % K)));
    }
}
