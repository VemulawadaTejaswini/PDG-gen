import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long a = sc.nextLong();
        float b = sc.nextFloat() * 100;
        long lb = (long)b;

//        System.out.println(lb);

        System.out.println((a*lb)/(long)100);
    }
}
