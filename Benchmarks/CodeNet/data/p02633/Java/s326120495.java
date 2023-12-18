import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {


        int x = sc.nextInt();

        long sum = (long)x;

        long cnt = 1;

        while (true) {
            sum += x;
            cnt++;
            if (sum%360==0) break;
        }

        System.out.println(cnt);

    }
}
