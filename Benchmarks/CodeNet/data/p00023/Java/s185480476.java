import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.math.BigInteger.*;
class AOJ0023 {
    static final double EPS = 1e-9;
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            double[] x = new double[2];
            double[] y = new double[2];
            double[] r = new double[2];
            for(int i = 0; i < 2; i++) {
                x[i] = sc.nextDouble();
                y[i] = sc.nextDouble();
                r[i] = sc.nextDouble();
            }
            double d = hypot(x[1] - x[0], y[1] - y[0]);
            if(r[0] + r[1] < d)
                System.out.println(0);
            else if(r[0] > r[1] + d)
                System.out.println(2);
            else if(r[1] > r[0] + d)
                System.out.println(-2);
            else
                System.out.println(1);
        }
    }
 
    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }
}
 
public class Main {
    public static void main(String...args) {
        new AOJ0023().run();
    }
}