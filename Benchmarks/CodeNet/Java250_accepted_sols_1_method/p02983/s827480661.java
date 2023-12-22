import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        if (b - a >= 2019) System.out.println(0);
        else {
            long min = Long.MAX_VALUE;
            for  (long i = a; i <= b; ++i) {
                for (long j = i + 1; j <= b; ++j) {
                    min = Math.min(min, ((i % 2019) * (j % 2019)) % 2019);
                }
            }

            System.out.println(min);
        }
    }
}