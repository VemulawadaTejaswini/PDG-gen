import java.math.BigDecimal;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double la = (l/3)*(l/3)*(l/3);
        System.out.println(BigDecimal.valueOf(la).toPlainString());
    }
}