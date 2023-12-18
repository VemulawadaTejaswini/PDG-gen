import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
double r = sc.nextDouble();
double pi = Math.PI;
double area = r*r*pi;
double length = 2*r*pi;

BigDecimal bd = new BigDecimal(area);
BigDecimal bd1 = bd.setScale(6, BigDecimal.ROUND_HALF_UP);
BigDecimal bd2 = new BigDecimal(length);
BigDecimal bd3 = bd2.setScale(6, BigDecimal.ROUND_HALF_UP);

System.out.println(bd1.doubleValue() + " " + bd3.doubleValue());

}
}