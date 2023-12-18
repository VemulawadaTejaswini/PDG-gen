import java.math.BigDecimal;
import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    double a;

            a = sc.nextDouble();

            System.out.println(BigDecimal.valueOf(a*a*Math.PI).toPlainString()+" "+ BigDecimal.valueOf( a * 2 * Math.PI).toPlainString());



    }
}

