import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
    
        if (A + B <= K) {
            A = 0;
            B = 0;
        } else if (A <= K) {
            B -= K - A;
            A = 0;
        } else {
            A -= K;
        }
        
        System.out.printf("%d %d", A, B);
        
    }
}