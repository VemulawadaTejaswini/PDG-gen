import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        String[] inp = buffer.readLine().split(" ");
        int[] arr = new int[n];
        int gcdRes = Integer.parseInt(inp[0]);
        for (int pos = 0; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
            gcdRes = gcd(gcdRes, arr[pos]);
        }

        HashSet<Integer> prevFacts = new HashSet<>();
        boolean checkCoprime = true;
        for (int pos = 0; pos < n; pos++) {
            for (int fact = 2; fact <= Math.sqrt(arr[pos]); fact++) {
                if (arr[pos] % fact == 0) {
                    if (!prevFacts.add(fact)) {
                        checkCoprime = false;
                        break;
                    }
                    int num = arr[pos];
                    while (num % fact == 0)
                        num /= fact;
                    if (num > 1) {
                        if (!prevFacts.add(num)) {
                            checkCoprime = false;
                            break;
                        }
                    }

                }
            }
            if (!checkCoprime)
                break;
        }
        if (checkCoprime) {
            System.out.println("pairwise coprime");
        } else if (gcdRes == 1)
            System.out.println("setwise coprime");
        else
            System.out.println("not coprime");
    }
}
