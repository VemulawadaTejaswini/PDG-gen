import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long r = sc.nextInt();
        long min = 2018;
        
        if (r - l <= 3000) {
            for (long i = l; i <= r - 1; i++) {
                for (long j = i + 1; j <= r; j++) {
                    long mod = i * j % 2019;
                    if (mod < min) {
                        //System.out.println(i + ", " + j);
                        min = mod;
                    }
                }
            }
        } else {
            min = 0;
        }
        System.out.println(min);
    }
}