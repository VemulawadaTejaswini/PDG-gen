import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String args[]) {
        int debt = 100000;
        int nWeeks = new Scanner(System.in).nextInt();
        for(int i = 0; i < nWeeks; i++) {
            debt = new BigDecimal(debt * 1.05).setScale(-3, RoundingMode.CEILING).intValue();
        }
        System.out.println(debt);

    }
} 