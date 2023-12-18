import java.util.*;

class Main {

    static void solve (long n) {
        
        long result = 0;

        for(long i = 5; i <= n; i *= 5) {
            result += n / i;     
        }

        System.out.println(result);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            long n = sc.nextLong();
            
            if (n == 0) break;
            
            solve(n);
        }

    }
}