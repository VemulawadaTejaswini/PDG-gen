import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        double area, circ;

        num = Double.parseDouble(scan.next());
        area = num * num * Math.PI;
        circ = num * 2.0 * Math.PI;

        System.out.print(BigDecimal.valueOf(area).toPlainString() + " ");
        System.out.println(BigDecimal.valueOf(circ).toPlainString());
    }
}

