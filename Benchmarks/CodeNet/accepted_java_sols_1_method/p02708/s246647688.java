import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);

        	long N = scan.nextLong();
        	long K = scan.nextLong();

        	scan.close();

        	long output = N*(N+1)*(N+2)/6 - (K-1)*K*(3*N-2*K+4)/6 + N - K + 2;

        	output %= 1000000007;

        	System.out.println(output);

        }

}