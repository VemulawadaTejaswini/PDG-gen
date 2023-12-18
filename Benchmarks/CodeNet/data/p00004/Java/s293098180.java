import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    double a,b,c,d,e,f,x,y;
    while(scan.hasNextDouble()){
    a = scan.nextDouble();
    b = scan.nextDouble();
    c = scan.nextDouble();
    d = scan.nextDouble();
    e = scan.nextDouble();
    f = scan.nextDouble();
    y = (d*c - a*f)/(d*b - a*e);
    x = (c-b*y)/a;
    System.out.printf("%.3f %.3f\n",x,y);
    }
    }
}