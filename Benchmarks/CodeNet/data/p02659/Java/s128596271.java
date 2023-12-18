import java.util.*;
import java.math.BigDecimal;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        BigDecimal ans = new BigDecimal(A*B);

        System.out.println(ans.setScale(0, BigDecimal.ROUND_DOWN));
    }
}