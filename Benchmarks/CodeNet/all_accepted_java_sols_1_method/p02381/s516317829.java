import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == 0)
                break;
            double s[] = new double[n];
            double ave = 0;
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextDouble();
                ave += s[i];
            }

            ave /= (double) n;
            double d = 0;
            for (int i = 0; i < n; i++) {
                d += (s[i] - ave) * (s[i] - ave);
            }
            d /= (double) n;
            System.out.printf("%.7f\n", Math.sqrt(d));
        }
    }
  
}
