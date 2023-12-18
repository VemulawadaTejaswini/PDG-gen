import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();
        double x = (m*11/360 - h/6) * Math.PI;
		System.out.println(Math.pow(a*a+b*b-2*a*b*Math.cos(x), 0.5));
    }
}