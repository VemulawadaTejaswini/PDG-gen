import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        double A = sn.nextLong();
        double B = sn.nextDouble();

        BigDecimal bd = new BigDecimal(String.valueOf(A*B));

        BigDecimal result = bd.setScale(0, RoundingMode.DOWN);


        System.out.println(result.toPlainString());
    }
}