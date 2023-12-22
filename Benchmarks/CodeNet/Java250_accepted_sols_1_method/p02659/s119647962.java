import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigDecimal A = sc.nextBigDecimal();
        double B = sc.nextDouble();

        BigDecimal ans = A.multiply(BigDecimal.valueOf(B));
        System.out.println(ans.longValue());
    }
}
