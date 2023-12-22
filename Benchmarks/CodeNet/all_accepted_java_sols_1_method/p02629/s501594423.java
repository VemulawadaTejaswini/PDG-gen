import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final long N = sc.nextLong() - 1;
        final int NUM = 26;
        
        StringBuilder str = new StringBuilder();
        str.append((char) ('a' + N % NUM));
        long n = N / NUM;
        
        while (0 < n) {
            str.append((char) ('a' + (n - 1) % NUM));
            n = (n - 1) / NUM;
        }
        
        System.out.println(str.reverse());
    }
}
