import java.util.*;

public class Main {
    static int MOD = 1000000007;
	static int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (is_prime(x) == false) {
            x++;
        }
        
        System.out.println(x);
    }

    public static boolean is_prime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}