import java.util.Scanner;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.141592653589;
        double r = sc.nextDouble();
        String str = BigDecimal.valueOf(r*r*pi).toPlainString();
        System.out.println(str+" "+r*2*pi);
    }
}
