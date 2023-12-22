import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double x = Math.PI;
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        if(0 < r && r < 10000){
            double length = 2 * r * x;
            double area = r * r * x;
            System.out.println(BigDecimal.valueOf(area).toPlainString() + " " + length);
        }

    }
}


