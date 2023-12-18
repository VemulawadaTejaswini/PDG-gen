import java.util.Scanner;


public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        double a = nextDouble();
        double b = nextDouble();
        double h = nextDouble();
        double m = nextDouble();

        h = h*30;
        h = h+0.5*m;

        m = m*6;

        double del = Math.abs(h-m);
        print(del);

        double ans = Math.sqrt(b*b + a*a - 2*b*a*Math.cos(Math.toRadians(del)));

        print(ans);
    }

    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void print(Object a){
        System.out.println(a);
    }
}