
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                sum = sum.add(BigInteger.valueOf(i));
            }
        }
        System.out.println(sum);
    }
}