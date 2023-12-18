import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
       double r = scan.nextInt();
       double S = r * r * pi;
       double d = 2 * r * pi;
       System.out.printf("%.05f", S);
       System.out.print(" ");
       System.out.printf("%.05f", d);
    }
}