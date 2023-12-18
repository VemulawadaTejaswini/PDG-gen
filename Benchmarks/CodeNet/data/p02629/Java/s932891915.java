import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final long N = sc.nextLong() - 1;
        final int NUM = 26;
        
        long n = N;
        StringBuilder str = new StringBuilder();
        
        while (true) {
            str.append((char) ('a' + n % NUM));
            n /= NUM;
            
            if (n == 0) {
                break;
            }
        }
        
        System.out.println(str.reverse());
    }
}
