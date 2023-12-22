import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double a = sc.nextDouble();

        System.out.println((new DecimalFormat("###########")).format(Math.ceil(h/a)));
    }
}