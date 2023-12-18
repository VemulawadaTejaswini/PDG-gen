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

        String n = arr01[0];
        int l = n.length();

        switch (l) {
        case 1:
            System.out.println(Integer.valueOf(n));
            break;
        case 2:

            System.out.println(9 - 1 + 1);
            break;
        case 3:
            System.out.println(9 - 1 + 1 + Integer.valueOf(n) - 100 + 1);

            break;
        case 4:

            System.out.println(9 - 1 + 1 + 999 - 100 + 1);
            break;
        case 5:
            System.out.println(9 - 1 + 1 + 999 - 100 + 1 + Integer.valueOf(n) - 10000 + 1);

            break;
        case 6:

            System.out.println(9 - 1 + 1 + 999 - 100 + 1 + 99999 - 10000 + 1);
            break;

        }

    }

}