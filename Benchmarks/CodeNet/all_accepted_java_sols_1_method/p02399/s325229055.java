import java.util.*;
import java.text.DecimalFormat;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00000");
        int a = input.nextInt();
        int b = input.nextInt();
        double aa = a;
        double bb = b;
        double s = aa/bb;
        String ss = df.format(s);
        System.out.println((a / b) + " " + (a % b) + " " + ss);
    }
}
