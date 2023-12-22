import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        double t = (double) H*5 + (double) M/12;
        double sa = Math.abs(t - M);

        if (sa > 30) {
            sa = 60 - sa;
        }

        sa *= 6.0;

        double ans = Math.pow(A, 2) + Math.pow(B, 2) - 2.0 * A * B * Math.cos(Math.toRadians(sa));

        System.out.println(Math.sqrt(ans));
    }
}