import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        double A = sn.nextLong();
        double B = sn.nextDouble();

        BigDecimal bd1 = new BigDecimal(String.valueOf(A));
        BigDecimal bd2 = new BigDecimal(String.valueOf(B));

        BigDecimal result = bd1.multiply(bd2);
        
        System.out.println(result.setScale(0, RoundingMode.DOWN).toPlainString());
    }
}