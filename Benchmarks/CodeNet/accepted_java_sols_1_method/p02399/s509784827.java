import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        long num1 = Integer.parseInt(lines[0]);
        long num2 = Integer.parseInt(lines[1]);

        long ans1 = num1 / num2;
        long ans2 = num1 % num2;
        double ans3 = (double)num1 / (double)num2;

        System.out.println(ans1 + " " + ans2 + " " + String.format("%.9f", ans3));


    }
}