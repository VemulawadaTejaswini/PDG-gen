import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();

        long mini = N + 1;

        for (long i = 1; i*i <= N; i++) {
            if (N % i == 0) {
                long j = N/i;
                mini = Math.min(i+j, mini);
            }
        }
        System.out.println(mini - 2);
        s.close();
    }
    
}