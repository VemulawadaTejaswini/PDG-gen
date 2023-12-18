import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                long A = scan.nextLong();
                long B = scan.nextLong();
                long N = scan.nextLong();

                long x = B - 1;

                long first;
                long second;
                long f;

                long max = -1000;

                if (B == 1) {
                        System.out.println(0);
                } else {
                        while (x < N ) {
                                first = A*x/B;
                                second = x/B;
                                f = first - A*second;
                                if (max < f) {
                                        max = f;
                                }
                                x += B;
                        }

                        first = A*N/B;
                        second = N/B;
                        f = first - A*second;
                        if (max < f) {
                                max = f;
                        }
                
                        System.out.println(max);

                }
        }

}