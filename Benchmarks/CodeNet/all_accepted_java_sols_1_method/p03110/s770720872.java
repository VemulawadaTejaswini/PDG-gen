import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        final Scanner lineScanner = new Scanner(System.in);
        final int inputLineNum = lineScanner.nextInt();
        double sum = 0;
        for (int i = 0; i < inputLineNum; i++) {
            double value = lineScanner.nextDouble();
            String money = lineScanner.next();
            if (money.equals("BTC")) {
                sum += value * 380000.0;
            } else {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}