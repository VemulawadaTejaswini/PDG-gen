import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       BigDecimal a = new BigDecimal(sc.next());
       BigDecimal b = new BigDecimal(sc.next());

       BigDecimal result = a.multiply(b).setScale(0, BigDecimal.ROUND_DOWN);
       System.out.println(result.toString());
    }
}