import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String args[]) {
        int debt = 100000;
        int nWeeks = Integer.parseInt(new Scanner(System.in).next());
        for(int i = 0; i < nWeeks; i++) {
            debt = new BigDecimal(debt * 1.05).setScale(-3, BigDecimal.ROUND_CEILING).intValue();
        }
        System.out.println(debt);

    }
} 