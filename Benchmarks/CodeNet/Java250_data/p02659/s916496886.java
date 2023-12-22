

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long bb = Math.round(b * 100);
        long ans = a * bb / 100;
        System.out.println(ans);


    }
}
