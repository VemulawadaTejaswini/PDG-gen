import java.util.*;

class Main {

    static void solve (int q) {
        double epsilon = (double)q;
        double x = (double)q;

        while (epsilon >= 0.0000001 * q) {
            x = x - (x * x * x - q) / (3.0 * x * x);
            epsilon = Math.abs(x * x * x - q);
        }

        System.out.printf("%.6f\n", x);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int q = sc.nextInt();
            if(q == -1) break;
            solve(q);
        }

    }
}