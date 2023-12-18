import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double L=sc.nextDouble();

        BigDecimal r=new BigDecimal(Math.pow((L/3), 3));
        System.out.println(r.toPlainString());
    }
}