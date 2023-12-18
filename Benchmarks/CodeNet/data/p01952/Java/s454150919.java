
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2852 Tiny Room
 *    2018/02/19
 */
public class Main {

    int N;
    int W;
    int H;
    int R;
    int[] x;
    int[] y;
    
    double func(double th) {
        double xmax = -Double.MAX_VALUE;
        double ymax = -Double.MAX_VALUE;
        double xmin = Double.MAX_VALUE;
        double ymin = Double.MAX_VALUE;
        for(int n = 0; n < N; n++) {
            double x0 = Math.cos(th) * x[n] - Math.sin(th) * y[n];
            double y0 = Math.sin(th) * x[n] + Math.cos(th) * y[n];
            if (x0 > xmax)
                xmax = x0;
            if (x0 < xmin)
                xmin = x0;
            if (y0 > ymax)
                ymax = y0;
            if (y0 < ymin)
                ymin = y0;
        }
        int f = 0;
        double max = Math.max(xmax - xmin -( W - R * 2), ymax - ymin -(H - R * 2) );
        return max;
    }
    
    // 最小を探す
    double smin(double x0, double x1, int l) {
        if (l > 20)
            return 0;
        double m = (x0 + x1) / 2;
        double delta = 0.0000000001;
        double k = func(m);
        double kd = func(m + delta);
        if (k <= 0)
            return -1;
        log.printf("x0 x1, m,k (%f %f %f) %f\n", x0, x1, m, k);
        if (k < kd) {
            return smin(x0 , m, l+1);
        }
        else {
            return smin(m, x1, l+1);
        }
    }

    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        N = sc.nextInt();
        H = sc.nextInt();
        W = sc.nextInt();
        R = sc.nextInt();
        //log.printf("%d %d\n",  N, M);
        x = new int[N];
        y = new int[N];
        for(int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            //log.printf("%d %d\n", x[i], y[i]);
        }

        
        int ret = 0;
        //int B = 100000000; 510242
        int B = 100;
        double k2 = 0;
        double d2 = 0;
        double d;
        for(int i = 0; i < B + 1; i++) {
            double s = i * Math.PI / B;
            double k = func(s);
            if (k < 0) {
                ret = 1;
                break;
            }
            //log.printf("i%d x%f(%f %f) y%f(%f %f) %f %s\n", i,xmax-xmin, xmin,xmax, ymax-ymin,ymin, ymax, min, f != 0?"OK":"");
            log.printf("%d\t%f\t%s\n", i, k, k <= 0?"OK":"");
            
            d = k - k2;
            if (i >= 2 && d2 <= 0 && d >= 0) {
                log.printf("koko\n");
                double sm = smin((i-2)*Math.PI / B,s,0);
                if (sm < 0) {
                    ret = 1;
                    break;
                }
            }
            
            k2 = k;
            d2 = d;
            
        }

        result.printf("%s\n", ret != 0? "Yes":"No");

        sc.close();
        return false;
    }

    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();

        instance.systemin.close();
    }


}


