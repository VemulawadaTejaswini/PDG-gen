import java.util.Scanner;
import java.util.Formatter;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double x=r*r* Math.PI;
        double y=2*r*Math.PI;
        System.out.println(String.format("%05f",x)+" "+String.format("%05f",y));
    }
}
