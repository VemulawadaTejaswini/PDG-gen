import java.io.*;
import java.util.*;

public class Main {

    private static int[] primes = new int[10000];

    public static void main(String[] argv) throws IOException {
        boolean[] primeFlag = new boolean[50000];
        Arrays.fill(primeFlag, true);
        int primesIndex = 0;
        for (int i = 2; i < 50000; i++) {
            if (primeFlag[i]) {
                primes[primesIndex++] = i;
                if (primesIndex >= 10000) {
                    break;
                }
                for (int j = i + i; j < 50000; j += i) {
                    primeFlag[j] = false;
                }
            }
        }
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = in.readLine();
            if (s == null || s.equals("0")) {
                break;
            }
            f(s);
        }
        //*/
    }

    public static void f(String s) {
        int sum = 0;
        int loop = Integer.parseInt(s);
        for (int i = 0; i < loop; i++) {
            sum += primes[i];
        }
        System.out.println(sum);
    }
}