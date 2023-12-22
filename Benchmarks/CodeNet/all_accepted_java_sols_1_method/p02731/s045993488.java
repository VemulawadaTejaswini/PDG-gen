import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        BigDecimal bg = new BigDecimal(l);
        bg.setScale(7);
        BigDecimal bg2 = bg.divide(new BigDecimal(3), 7, BigDecimal.ROUND_DOWN);

        System.out.println(bg2.multiply(bg2).multiply(bg2));
        sc.close();

    }

}
