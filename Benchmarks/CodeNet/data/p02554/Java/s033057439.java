import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int n = sc.nextInt();
        long ans = powMod(10, n, mod) - powMod(9, n, mod) * 2 + powMod(8, n, mod);
        System.out.println(((ans % mod) + mod) % mod);
	}
  
    static long powMod(long num, int pow, int mod) {
        long r = 1L;
        for (int i = 0; i < pow; i++) {
            r = r * num % mod;
        }
        return r;
    }
}