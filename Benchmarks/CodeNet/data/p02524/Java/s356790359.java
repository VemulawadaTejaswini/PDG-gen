import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double uho=Math.toRadians(sc.nextDouble());
        double S=a*b*Math.sin(uho)/2;
        double L=a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*Math.cos(uho));
        double h=b*Math.sin(uho);
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}