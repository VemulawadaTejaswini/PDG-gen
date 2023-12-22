
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int h = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        BigDecimal b = (new BigDecimal(w).multiply(new BigDecimal(h))).divide(new BigDecimal(2),6,BigDecimal.ROUND_HALF_UP);
        System.out.println(b.toPlainString()+" "+((x+x==w&&y+y==h) ? "1":"0"));
    }
}
