
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigDecimal sum = new BigDecimal("0");

        for(int i=0; i<n; i++) {
            String a = sc.next();
            String b = sc.next();
            if(b.equals("JPY")) {
                sum = sum.add(new BigDecimal(a));
            } else {
                sum = sum.add(new BigDecimal(a).multiply(new BigDecimal("380000")));
            }
        }

        System.out.println(sum.toPlainString());

    }

}
