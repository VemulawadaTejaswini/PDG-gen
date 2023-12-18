import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        long start1 = System.currentTimeMillis();
//        long end1 = System.currentTimeMillis();
//        System.out.println("time1: " + (end1 - start1));

        Scanner scanner = new Scanner(System.in);
        double l = Integer.parseInt(scanner.nextLine());

//        double v = Math.pow((l / 3), 3);
        double v = (l / 3) * (l / 3) * (l / 3);

        System.out.println(BigDecimal.valueOf(v).toPlainString());
    }
}