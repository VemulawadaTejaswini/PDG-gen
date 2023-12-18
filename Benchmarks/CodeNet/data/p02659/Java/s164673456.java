import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        long A = sc.nextLong();
        double B = sc.nextDouble();
        BigDecimal ans = new BigDecimal(A*B);

        System.out.println(ans.setScale(0, RoundingMode.DOWN));
    }
}