import java.math.BigDecimal;
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigDecimal x = sc.nextBigDecimal();
        BigDecimal y = sc.nextBigDecimal();
        System.out.println(x.multiply(y).toBigInteger());
    }
}