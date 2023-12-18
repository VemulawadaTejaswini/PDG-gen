import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = Long.parseLong(sc.next().replaceAll("\\.", ""));
        String res =  new BigDecimal(a).multiply(new BigDecimal(b)).divide(new BigDecimal("100")).toPlainString();
        if(res.contains(".")) {
            res = res.substring(0, res.indexOf("."));
        }
        System.out.println(res);

    }
}