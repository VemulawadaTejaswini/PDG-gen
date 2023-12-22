import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        DecimalFormat df1 = new DecimalFormat("0.00000");
        Double c = a*1.0/b;
        System.out.println(a/b + " " +a%b  + " " + df1.format(c));
    }
}