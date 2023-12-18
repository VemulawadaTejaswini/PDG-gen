import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), cnt = 0;
        String s = sc.next();
        BigInteger b = BigInteger.ZERO, d = BigInteger.ONE;
        List<BigInteger> list = new ArrayList<>();
        for (int i = t; i > 0; i--) {
            if ('1' == s.charAt(i - 1)) {
                b = b.add(d);
                cnt++;
            }
            list.add(d);
            d = d.multiply(BigInteger.TWO);
        }
        for (int i = t; i > 0; i--) {
            BigInteger calc, div;
            if ('1' == s.charAt(t-i)) {
                calc = b.subtract(list.get(i - 1));
                div = BigInteger.valueOf(cnt - 1);
            } else {
                calc = b.add(list.get(i - 1));
                div = BigInteger.valueOf(cnt + 1);
            }
            int num = 0;
            while (calc != BigInteger.ZERO) {
                num++;
                calc = calc.mod(div);
                div = BigInteger.valueOf(calc.bitCount());
            }
            System.out.println(num);
        }
    }
}