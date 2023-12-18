import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double area = (a*b*Math.sin(Math.toRadians(c)))/2;
        double length = a+b+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-(2*a*b*Math.cos(Math.toRadians(c))));
        double h = (2*area)/a;
        System.out.println(String.format("%.5f",area));
        System.out.println(String.format("%.5f",length));
        System.out.println(String.format("%.5f",h));
    }
}
