import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double r,men,shu;
        r=scan.nextDouble();
         
        men=r*r*Math.PI;
        shu=r*2*Math.PI;
        System.out.println(BigDecimal.valueOf(men).toPlainString()+" "+BigDecimal.valueOf(shu).toPlainString());
    }
}
