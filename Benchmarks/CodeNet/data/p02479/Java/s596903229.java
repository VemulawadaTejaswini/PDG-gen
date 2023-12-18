import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	DecimalFormat df1 = new DecimalFormat("0.00000");
        double r = sc.nextDouble();
        double pi = Math.PI;
        double area = pi*r*r;
        double length = 2*pi*r;
        System.out.println(df1.format(area)+" "+df1.format(length));
    }
}