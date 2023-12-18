import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,d,r;
        double f;
        String ans;
        a=scan.nextInt();
        b=scan.nextInt();

        d=a/b;
        r=a%b;
        f=(double)a/b;
        BigDecimal answer=java.math.BigDecimal.valueOf(f);
        ans=answer.toPlainString();
        System.out.println(d +" "+ r +" "+ ans);
    }
}
