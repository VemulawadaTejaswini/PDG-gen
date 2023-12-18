import java.util.Stack;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static long res = 0;
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        while (sc.hasNext()) {
            BigDecimal a = new BigDecimal(sc.next());
            BigDecimal b = new BigDecimal(sc.next());
            a = a.add(b);
            String s = a.toPlainString();
            if (s.length() > 80) {
                System.out.println("overflow");
            } else {
                System.out.println(s);
            }
        }
    }
}