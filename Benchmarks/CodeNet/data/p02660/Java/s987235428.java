

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        BigInteger first = new BigInteger(in.nextLine());
        if (first.equals(BigInteger.ONE)) {
            System.out.println(0);
            return;
        }
        int res = 0;
        for (long i = 2; BigInteger.valueOf(i).multiply(BigInteger.valueOf(i)).compareTo(first) <= 0; i++) {
            int counter = 1;
            int c = 2;
            for (int j = 1; first.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO); j++) {
                first = first.divide(BigInteger.valueOf(i));
                if (counter == j) {
                    res++;
                    counter += c++;
                }
            }
        }
        System.out.println(res == 0 ? 1 : res);
    }
}
