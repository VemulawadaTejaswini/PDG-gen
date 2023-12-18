import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        
        String tmp = a.multiply(b).toString();
        
        int dotIndex = tmp.indexOf(".");
        String ans = tmp.substring(0, dotIndex);
        
        System.out.println(ans);
    }
}