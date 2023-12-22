import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Double r,length,area,pi;
        NumberFormat nf = new DecimalFormat("0.000000");
        Scanner sc = new Scanner(System.in);
        pi = Math.PI;
        r = sc.nextDouble();
        length = 2*r*pi;
        area = r*r*pi;
        System.out.println(nf.format(area) + " " + nf.format(length) );
    }
}