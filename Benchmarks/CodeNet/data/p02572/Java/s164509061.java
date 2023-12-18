import java.math.BigInteger;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                BigInteger[] A = new BigInteger[N];
                BigInteger[] Asum = new BigInteger[N];

                for (int i = 0; i < N; i++) {
                	 long temp = scan.nextLong();
                	 A[i] = BigInteger.valueOf(temp);
                }

                Asum[N-1] = A[N-1];

                for (int i = N-2; i >= 0; i--) {
                	Asum[i] = Asum[i+1].add(A[i]);
                }

                BigInteger sum = BigInteger.valueOf(0);

                for (int i = 0; i < N -1; i++) {
                	sum = sum.add(A[i].multiply(Asum[i+1]));
                	sum = sum.mod(BigInteger.valueOf(1000000007));
                }

                System.out.println(sum.intValue());

                scan.close();

        }

}