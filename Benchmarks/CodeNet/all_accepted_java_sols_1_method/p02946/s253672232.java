import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BigDecimal x1 = new BigDecimal("1");
        BigDecimal y = new BigDecimal("30");
        BigDecimal z = new BigDecimal("10");

        //足し算
        //        BigDecimal z1 = x.add(y);
        //        //引き算
        //        BigDecimal z2 = x.subtract(y);
        //        //掛け算
        //        BigDecimal z3 = x.multiply(y);
        //割り算
        BigDecimal z4 = x1.divide(y, 5, BigDecimal.ROUND_FLOOR);
        //割り算
        BigDecimal z5 = x1.divide(z, 5, BigDecimal.ROUND_FLOOR);

        BigDecimal z1 = new BigDecimal("1");
        BigDecimal z6 = z1.add(z4);

        //        System.out.println(z1);
        //        System.out.println(z2);
        //        System.out.println(z3);
        //        System.out.println(z4);
        //        System.out.println(z5);
        //        System.out.println(z6);

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        List<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }
        String arr01[] = mylist.get(0).split(" ");

        Integer k = Integer.valueOf(arr01[0]);
        Integer n = Integer.valueOf(arr01[1]);

        int mindata = n - k + 1;
        int maxdata = n + k - 1;

        List<String> res = new ArrayList<>();
        for (int i = mindata; i <= maxdata; i++) {
            res.add(String.valueOf(i));
        }

        String strdata = String.join(" ", res);

        System.out.println(strdata);

    }

}