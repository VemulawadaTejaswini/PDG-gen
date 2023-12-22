import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(a*b*Math.sin(Math.toRadians(c))/2);
        System.out.println(a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c))));
        System.out.println(b*Math.sin(Math.toRadians(c)));
    }
}

