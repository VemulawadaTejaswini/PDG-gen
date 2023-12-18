import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        String s = sc.next();

        int bitCount = 0;
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '1') bitCount++;
        }

        int[] remain = new int[n];

        for (int i=n-1; 0<=i; i--) {
            if (i==n-1) remain[i] = 1;
            else {
                remain[i] = remain[i+1] * 2 % bitCount;
            }
//            System.out.println(remain[i]);
        }

        for (int i=0; i<n; i++) {
//            System.out.println(remain[i]);
        }

        int base = 0;
        for (int i=0; i<n; i++) {
            int t = Integer.parseInt(s.substring(i, i+1));
            if (t == 1) {
                base += remain[i];
                base %= bitCount;
            }
        }
        int mBase = 0;
        for (int i=0; i<n; i++) {
            int t = Integer.parseInt(s.substring(i, i+1));
            if (t == 1) {
                base += remain[i];
                base %= (bitCount-1);
            }
        }
        int pBase = 0;
        for (int i=0; i<n; i++) {
            int t = Integer.parseInt(s.substring(i, i+1));
            if (t == 1) {
                base += remain[i];
                base %= (bitCount+1);
            }
        }
//        System.out.println("base" + base);

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            int tmp = 0;
            if (s.charAt(i) == '0') {
                tmp = pBase + remain[i];
            } else {
                tmp = mBase - remain[i];
            }
            if (s.charAt(i) == '0') bitCount++;
            else bitCount--;
            tmp += bitCount;
            tmp %= bitCount;
//            System.out.println(tmp);

            int popc = 0;
            while (0<tmp) {
                int bitc = Integer.bitCount(tmp);
                tmp %= bitc;
                popc++;
            }
            sb.append(popc + "\n");
        }

        System.out.print(sb.toString());
//        long n = 01110111001011011001110L;

//        System.out.print(n % (long)Long.bitCount(n));

    }


}

