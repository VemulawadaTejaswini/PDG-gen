import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double s = 0.5*a*b*Math.sin(Math.toRadians(c));
        double l = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(c)));
        double h = 2 * s / a;
        
        System.out.println(s);
        System.out.println(l);
        System.out.println(h);
    }
}
