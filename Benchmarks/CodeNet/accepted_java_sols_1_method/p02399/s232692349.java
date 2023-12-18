import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA, numB;
        double buf;

        numA = Integer.parseInt(scan.next());
        numB = Integer.parseInt(scan.next());

        buf = (double)numA / (double)numB;

        System.out.print(numA / numB + " ");
        System.out.print(numA % numB + " ");
        System.out.println(BigDecimal.valueOf(buf).toPlainString());
    }
}

