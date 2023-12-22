import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nt = Arrays.stream(sc.nextLine().split(" +")).mapToInt(Integer::parseInt).toArray();
        int n = nt[0];
        int t = nt[1];

        int c = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int[] ct = Arrays.stream(sc.nextLine().split(" +")).mapToInt(Integer::parseInt).toArray();
            if (ct[1] <= t && c > ct[0]) c = ct[0];
        }

        if (c == Integer.MAX_VALUE) {
            System.out.println("TLE");
        }
        else {
            System.out.println(c);
        }
        sc.close();
    }
}
