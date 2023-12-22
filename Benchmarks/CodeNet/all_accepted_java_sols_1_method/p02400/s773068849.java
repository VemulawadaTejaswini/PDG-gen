import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double a=r*2*Math.PI;
        double b=r*r*Math.PI;
        System.out.printf("%10f %10f",b,a);
    }
}
