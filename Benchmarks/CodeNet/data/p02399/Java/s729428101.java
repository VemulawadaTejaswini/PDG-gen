import java.util.Scanner;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        double c= (double)a/b;
        String str = BigDecimal.valueOf(c).toPlainString();
        System.out.println(a/b+" "+a%b+" "+str);
    }
}
