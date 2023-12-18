import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long a = sc.nextLong();
        double b = sc.nextDouble();
        long lb = 0;
        for (int i=0; i<1000; i++) {
            double tmp = (double)i / (double)100;
            if (tmp==b) {
                lb = i;
            }
        }

//        System.out.println(lb);

        System.out.println((a*lb)/(long)100);
    }
}
