import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;

public class Main {
    public static void main(String args[]) throws IOException {
        int debt = 100000;
        int nWeeks = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        for(int i = 0; i < nWeeks; i++) {
            debt = new BigDecimal(debt * 1.05).setScale(-3, BigDecimal.ROUND_CEILING).intValue();
        }
        System.out.println(debt);

    }
} 