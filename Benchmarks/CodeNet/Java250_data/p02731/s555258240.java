import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double a = l * l * l /27.0;
        //BigDecimal ll = BigDecimal.valueOf(a);
        System.out.println(a);
    }
}