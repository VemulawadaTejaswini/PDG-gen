import java.math.BigDecimal;
import java.util.Scanner;

class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int   a = sc.nextInt();
        int   b = sc.nextInt();
        long  d = a/b;
        int   r = a%b;
        double f = (double)a/b;
        sc.close();

        System.out.println(new StringBuilder()
            .append(d).append(" ")
            .append(r).append(" ")
            .append(BigDecimal.valueOf(f).toPlainString()));
    }
}