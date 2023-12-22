import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] lims = new long[5];
        int minpart = 0;
        for (int i = 0; i < 5; i++) {
            lims[i] = sc.nextLong();
            if (lims[i] < lims[minpart]) {
                minpart = i;
            }
        }
        
        long times = 0;
        times += 5;
        if (n % lims[minpart] == 0) {
            times += n / lims[minpart] - 1;
        } else {
            times += n / lims[minpart];
        }
        
        System.out.println(times);
    }
}
