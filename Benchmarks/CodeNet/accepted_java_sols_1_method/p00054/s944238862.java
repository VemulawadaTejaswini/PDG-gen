import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            while (sc.hasNextBigDecimal()) {

                BigDecimal a = sc.nextBigDecimal();
                BigDecimal b = sc.nextBigDecimal();
                int n = sc.nextInt();

                // divide
                String aDivideB = String.valueOf(a.divide(b, n,
                        RoundingMode.DOWN));

                // add
                char[] array = aDivideB.substring(aDivideB.indexOf(".") + 1)
                        .toCharArray();
                int s = 0;
                for (char c : array) {
                    s += Integer.parseInt(String.valueOf(c));
                }

                System.out.println(s);
            }
        } finally {
            sc.close();
        }
    }

}