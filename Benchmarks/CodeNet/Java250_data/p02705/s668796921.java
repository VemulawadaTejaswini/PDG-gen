import java.util.*;
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args){
        BigDecimal A, B;
        Scanner sc = new Scanner(System.in);
        A =sc.nextBigDecimal();
        B = new BigDecimal(2).multiply(A).multiply(new BigDecimal(3.14159265359));
        System.out.println(B);
    }
}

