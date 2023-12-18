import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        long R = (N+1L)*N-1L;

        for (long i = 2; 2*i <= N; i++) {
            R += (((N/i)*i+i*2L)*((N-i)/i))/2L;
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
