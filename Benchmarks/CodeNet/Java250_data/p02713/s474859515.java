import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int K = Integer.parseInt(input);
        long ans = 0;
        
        for(int a = 1; a <= K; a++){
            for(int b = 1; b <= K; b++){
                for(int c = 1; c <= K; c++){
                    ans += gcd(a, gcd(b, c));
                }
            }
        }
        
        System.out.println(ans);
    }
    
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
