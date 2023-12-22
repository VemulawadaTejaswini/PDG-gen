import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        
        N = N - N/K*K;
        
        while(N > sub(N,K)) {
        N = sub(N,K);
        }
        System.out.println(N);

        sc.close();
    }
    public static long sub(long A, long B) {
        return Math.abs(A-B);
    }
}
