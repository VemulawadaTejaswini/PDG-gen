import java.math.BigDecimal;
import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
     int a,b;

            a = sc.nextInt();
            b = sc.nextInt();
        System.out.print(a / b + " " + a % b);
        double c = (double)a / b;
        
            System.out.println(" "+BigDecimal.valueOf(c).toPlainString());



    }
}

