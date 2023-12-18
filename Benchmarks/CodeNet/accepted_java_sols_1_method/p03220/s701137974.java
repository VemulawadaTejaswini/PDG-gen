import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double t = sc.nextInt();
        double a = sc.nextInt();

        int cand = 0;
        double min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            double dif = Math.abs(t - (sc.nextDouble() * 0.006) - a);
            if (dif < min) {
                cand = i;
                min = dif;
            }
        }
        System.out.println(cand + 1);
    }
}
